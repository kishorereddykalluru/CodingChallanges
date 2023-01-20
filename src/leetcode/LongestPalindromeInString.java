package leetcode;

public class LongestPalindromeInString {
    
    int resultIndex;
    int resultLength;

    /**
     * find longest palindrome
     * @param str string to check for longest palindrome
     * @return longest palindrome
     */
    public String longestPalindrome(String str) {
        if(str.length() < 2){
            return str;
        }
        for (int start = 0; start < str.length(); start++) {
            expandRange(str, start, start);
            expandRange(str, start, start + 1);
        }

        return str.substring(resultIndex, resultIndex + resultLength);
    }

    public void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if(resultLength < end - begin - 1){
            resultIndex = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        LongestPalindromeInString palindromeInString = new LongestPalindromeInString();

        String pali = palindromeInString.longestPalindrome("palinmaddampopperstop");
        System.out.println("pali = " + pali);

    }
}

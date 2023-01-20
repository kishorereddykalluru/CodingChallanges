package codingchallanges.general.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("madame"));
    }

    /**
     * Checks for palindrome
     * @param palindrome
     * @return
     */
    private static String checkPalindrome(String palindrome){
        int start = 0;
        int end  = palindrome.length() - 1;
        System.out.println("start = " + start);
        System.out.println("end = " + end);

        while (end > start){
            if (palindrome.charAt(start) != palindrome.charAt(end)) {
                return "not palindrome";
            } else {
                end--;
                start++;
            }
        }
        return "palindrome";
    }
}

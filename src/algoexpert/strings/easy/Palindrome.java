package algoexpert.strings.easy;

public class Palindrome {

    public static boolean isPalindrome1(String str) {
        //also you can use string buffer in place of String for reversing
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static boolean isPalindrome2(String str) {
        int leftIdx = 0;
        int rightIdx = str.length()-1;

        while(leftIdx < rightIdx) {
            if(str.charAt(leftIdx) != str.charAt(rightIdx)){
                return false;
            }
            leftIdx++;
            rightIdx--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome1("aaa"));
    }
}

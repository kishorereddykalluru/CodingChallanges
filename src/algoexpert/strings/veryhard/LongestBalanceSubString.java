package algoexpert.strings.veryhard;

import java.util.Stack;

public class LongestBalanceSubString {
    // O(n^3) time | O(n) space
    public static int longestBalancedSubstring1(String string) {
        int maxLength = 0;

        for(int i = 0; i < string.length(); i++) {
            for(int j = i+2; j < string.length() + 1; j+=2){
                if(isBalanced(string.substring(i, j))) {
                    int currentLength = j - i;
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }
        return maxLength;
    }

    public static boolean isBalanced(String string) {
        Stack<Character> openParensStack = new Stack<>();

        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c == '(') {
                openParensStack.push('(');
            } else if(openParensStack.size() > 0){
                openParensStack.pop();
            } else {
                return false;
            }
        }

        return openParensStack.size() == 0;
    }
    // O(n) time | O(n) space
    public static int longestBalancedSubstring2(String string) {
        int maxLength = 0;
        Stack<Integer> idxStack = new Stack<>();
        idxStack.push(-1);

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '('){
                idxStack.push(i);
            } else {
             idxStack.pop();
             if(idxStack.size() == 0) {
                 idxStack.push(i);
             } else {
                 int balancedSubstringStartIdx = idxStack.peek();
                 int currentLength = i - balancedSubstringStartIdx;
                 maxLength = Math.max(maxLength, currentLength);
             }
            }
        }
        return maxLength;
    }
    // O(n) time | O(1) space
    public static int longestBalancedSubstring3(String string) {
        int maxLength = 0;

        int openingCount = 0;
        int closingCount = 0;

        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if(c == '('){
                openingCount += 1;
            } else {
                closingCount += 1;
            }

            if(openingCount == closingCount){
                maxLength = Math.max(maxLength, closingCount * 2);
            } else if(closingCount > openingCount) {
                openingCount = 0;
                closingCount = 0;
            }
        }

        openingCount = 0;
        closingCount = 0;

        for(int i = string.length() - 1; i >= 0; i--) {
            char c = string.charAt(i);

            if(c == '('){
                openingCount += 1;
            } else {
                closingCount += 1;
            }

            if(openingCount == closingCount) {
                maxLength = Math.max(maxLength, openingCount * 2);
            } else if(openingCount > closingCount) {
                openingCount = 0;
                closingCount = 0;
            }
        }
        return maxLength;
    }
    // O(n) time | O(1) space
    public static int longestBalancedSubstring4(String string) {
        return Math.max(getLongestBalancedStringInDirection(string, true), getLongestBalancedStringInDirection(string, false));
    }
    public static int getLongestBalancedStringInDirection(String string, boolean leftToRight) {
        char openingParens = leftToRight ? '(' : ')';
        int startIdx = leftToRight ? 0 : string.length() - 1;
        int step = leftToRight ? 1 : -1;

        int maxLength = 0;

        int openingCount = 0;
        int closingCount = 0;

        int idx = startIdx;
        while (idx >= 0 && idx < string.length()) {
            char c = string.charAt(idx);

            if(c == openingParens) {
                openingCount +=1;
            } else {
                closingCount += 1;
            }

            if(openingCount == closingCount) {
                maxLength = Math.max(maxLength, closingCount * 2);
            } else if(closingCount > openingCount) {
                openingCount = 0;
                closingCount = 0;
            }

            idx += step;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(longestBalancedSubstring4("(()))("));
    }
}

package codingchallanges.interviewquestions;

import java.util.Map;
import java.util.Stack;

/**
 * Epam second program
 */
public class EpamValidParanthesis {
    public static void main(String[] args) {
        String test1 = "{[()]}";// TRUE CASE {}[]()
// Below method call should print true
        System.out.println(solution(test1));

        String test2 = "{]]]](";
// Below method call should print false
        System.out.println(solution(test2));
    }


    public static boolean solution(String input) {

        //if length of input is not even then it is not valid parentheses
        if(input.length() % 2 != 0) return false;

        Map<Character, Character> m = Map.of(')', '(', '}','{', ']', '[');

        Stack<Character> s = new Stack<>();
        for(char c : input.toCharArray()) {
            if(c == '(' || c == '{' || c == ']') {
                s.push(c);
            } else if (!s.isEmpty() && s.peek() != m.get(c)) {
                s.pop();
            } else {
                return false;
            }
        }
        return s.isEmpty();
    }
}


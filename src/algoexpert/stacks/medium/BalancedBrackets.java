package algoexpert.stacks.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean balancedBrackets(String str) {
        if(str.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> balancedMap = new HashMap<>();
        balancedMap.put(']', '[');
        balancedMap.put('}', '{');
        balancedMap.put(')', '(');

        for(Character c: str.toCharArray()){
            if(c == ']' || c == ')' || c =='}'){
                if(stack.isEmpty()) return false;
                Character pop = stack.pop();
                if(pop != balancedMap.get(c)){
                    return false;
                }
            } else if(c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(balancedBrackets(")[]}"));

    }
}

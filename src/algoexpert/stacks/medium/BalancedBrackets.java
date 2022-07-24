package algoexpert.stacks.medium;

import java.util.*;

public class BalancedBrackets {

    public static boolean balancedBrackets1(String str) {
        String openingBrackets = "([{";
        String closingBrackets = ")]}";

        Map<Character, Character> matchingBrackets = new HashMap<>();

        matchingBrackets.put(')', '(');
        matchingBrackets.put(']', '[');
        matchingBrackets.put('}', '{');

        List<Character> stack = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(openingBrackets.indexOf(letter) != -1){
                stack.add(letter);
            } else if(closingBrackets.indexOf(letter) != -1) {
                if(stack.size() == 0) {
                    return false;
                }
                if(stack.get(stack.size() - 1) == matchingBrackets.get(letter)) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
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

        System.out.println(balancedBrackets1("{[]}"));

    }
}

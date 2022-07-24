package algoexpert.stacks.medium;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    // O(n) time | O(n) space - where n is the length of the array
    public static int[] nextGreaterElement(int[] array) {
        int[] result = new int[array.length];

        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for(int idx = 0; idx < 2 * array.length; idx++) {
            int circularIdx = idx % array.length;

            while(stack.size() > 0 && array[stack.peek()] < array[circularIdx]) {
                int top = stack.pop();
                result[top] = array[circularIdx];
            }

            stack.push(circularIdx);
        }

        return result;
    }

    // O(n) time | O(n) space - where n is the length of the array
    public static int[] nextGreaterElement1(int[] array) {

        int[] result = new int[array.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();
        for(int idx = 2 * array.length - 1; idx >= 0; idx--) {
            int circularIdx = idx % array.length;

            while(stack.size() > 0) {
                if(stack.peek() > 0) {
                    stack.pop();
                } else {
                    result[circularIdx] = stack.peek();
                    break;
                }
            }
            stack.push(array[circularIdx]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] result = nextGreaterElement1(new int[] {2, 5, -3, -4, 6, 7, 2});
        for(int r: result)
            System.out.print(r + " ");
    }
}

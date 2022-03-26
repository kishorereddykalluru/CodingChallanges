package algoexpert.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            int difference = targetSum - array[i];
            if(!indexMap.containsKey(difference)) {
                indexMap.put(array[i], i);
            } else {
                return new int[] {difference, array[i]};
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int[] ints = twoNumberSum(array, 10);
        for(int integer: ints){
            System.out.println("integer = " + integer);
        }
    }
}

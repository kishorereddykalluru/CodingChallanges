package algoexpert.arrays.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a function that takes in a non-empty array of distinct integers and
 */
public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> nums = new HashSet<>();
        for(int num: array) {
            int difference = targetSum - num;
            if(!nums.contains(difference)) {
                nums.add(num);
            } else {
                return new int[] {difference, num};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

    }
}

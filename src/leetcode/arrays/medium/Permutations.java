package leetcode.arrays.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {

    public static List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();

        int n = nums.length;
       backtracking(n, nums, result, 0);

       return result;
    }

    public static void backtracking(int n, int[] nums, List<List<Integer>> result, int first) {

        if(first == n)
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        for(int i = first; i < n; i++) {
            swap(nums, first, i);
            backtracking(n, nums, result, first+1);
            swap(nums, first, i);
        }
    }

    public static void swap(int[] nums, int first, int i){
        int temp =  nums[first];
        nums[first] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {

        int [] nums = {1,2,3};
        System.out.println(permutations(nums));

    }
}
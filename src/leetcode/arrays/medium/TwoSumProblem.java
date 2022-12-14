package leetcode.arrays.medium;

import java.util.*;

public class TwoSumProblem {

    public static List<List<Integer>> twoSum(int[] array) {
        int n = array.length;
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < n && array[i] <= 0; i++) {
            if(i == 0 || array[i-1] < array[i]){
                twoSum(array, i, result);
            }
        }
        return result;
    }

    private static void twoSum(int[] array, int i, List<List<Integer>> result) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int j = i + 1; j < array.length; j++) {
            int diff = -array[i] - array[j];
            if(hashSet.contains(diff)){
                result.add(Arrays.asList(array[i], array[j], diff));
            }
            hashSet.add(array[j]);
        }
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        System.out.println(twoSum(array));
    }
}

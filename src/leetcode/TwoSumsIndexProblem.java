package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumsIndexProblem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 4, 10};
        int result = 7;
        int[] sumIndexes = twoSumsProblem(arr, result);
        System.out.println(sumIndexes[0]+"  "+sumIndexes[1]);
    }

    private static int[] twoSumsProblem(int[] arr, int result) {
        Map<Integer, Integer> valueIndexesMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int delta = result - arr[i];
            if(valueIndexesMap.containsKey(delta)){
                return new int[] {valueIndexesMap.get(delta), i};
            }
            valueIndexesMap.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

}

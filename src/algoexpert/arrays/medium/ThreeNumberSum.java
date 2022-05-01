package algoexpert.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<>();
        for(int idx = 0; idx < array.length-2; idx++){
            int left = idx + 1;
            int right = array.length - 1;

            while(left < right) {
                int currentSum = array[idx] + array[left] + array[right];
                if(currentSum == targetSum) {
                    Integer[] newTriplet = {array[idx], array[left], array[right]};
                    triplets.add(newTriplet);
                    left++;
                    right--;
                } else if (currentSum < targetSum){
                    left++;
                } else if (currentSum > targetSum){
                    right--;
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        List<Integer[]> newList = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6},0);
        newList.stream().forEach(
                e -> {
                    Arrays.stream(e).forEach(System.out::print);
                    System.out.println();
                }

        );
    }
}

package leetcode.arrays.easy;

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int i =0;
        int j = nums.length -1;

        while( i < j) {
            if(nums[i] % 2 != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            } else {
                i++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int arr[] = sortArrayByParity(new int[] {3, 1, 2, 4});
        Arrays.stream(arr).forEach(System.out::println);

    }
}

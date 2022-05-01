package leetcode.arrays.medium;

import java.util.Arrays;

public class LeastPositiveNumber {

    public static int leastPositiveNumber(int[] nums){
        int len = nums.length;
        boolean containsOne = false;
        for(int i = 0; i < len; i++){
            if(nums[i] == 1) containsOne = true;
            else if(nums[i] <= 0 || nums[i] > len){
                nums[i] = -1;
            }
        }

        if(!containsOne) return 1;

        for(int i = 0; i < len; i++){
            int index = Math.abs(nums [i]) - 1;
            if(nums[index] > 0)  nums[index] = -1 * nums[index];
        }

        for(int i = 0; i < len; i++){
            if(nums[i] > 0){
                return (i + 1);
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {

        int[] nums = {-4, 1, 2, 95, 7, -2, 6, 90, 38};
        System.out.println(leastPositiveNumber(nums));

    }
}

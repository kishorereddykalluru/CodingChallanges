package leetcode.easy.arrays;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums){

        int maxSum = nums[0];
        int currSUm = maxSum;
       for(int i = 1; i < nums.length; i++){
            currSUm = Math.max((nums[i] + currSUm), nums[i]);
            maxSum = Math.max(currSUm, maxSum);
       }
       return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr)) ;
    }
}

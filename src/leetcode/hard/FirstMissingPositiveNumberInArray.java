package leetcode.hard;

public class FirstMissingPositiveNumberInArray {

    public static int firstMissingPositiveNumber(int[] nums) {

        if(nums == null || nums.length == 0) return 1;

        int n = nums.length, containsOne = 0;
        //step 1
        // convert all negative numbers to 1
        for(int i = 0; i < n ; i++){
            if(nums[i] == 1){
                containsOne = 1;
            } else if(nums[i] <= 0 || nums[i] > n){
                nums[i] = 1;
            }
        }

        if(containsOne == 0) return 1;

        //step 2
        //convert all the elements to negative numbers based on index
        for(int i = 0; i < n; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) nums[index] = -1 * nums[index];
        }

        //step 3
        //which contains positive number the next index is least positive missing number in array
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                return (i + 1);
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(firstMissingPositiveNumber(nums));

    }
}

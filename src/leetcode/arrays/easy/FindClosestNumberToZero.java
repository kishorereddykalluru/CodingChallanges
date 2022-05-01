package leetcode.arrays.easy;

public class FindClosestNumberToZero {


    public static int findClosestNumber(int[] nums) {
        int closest = Integer.MAX_VALUE;
       for(int num : nums){
           // this is my solution
//           if(Math.abs(num) < Math.abs(closest) || Math.abs(num) == Math.abs(closest) && num > closest){
//               closest = num;
//           }

           if(Math.abs(num) < Math.abs(closest)) closest = num;
           else if(Math.abs(num) == Math.abs(closest)) closest = Math.max(num, closest);
       }
        return closest;
    }

    public static void main(String[] args) {

        System.out.println(findClosestNumber(new int[] {-1, -1}));
    }
}

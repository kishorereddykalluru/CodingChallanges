package leetcode.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndices {

    //passed in all conditions
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> numsList = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
             if(nums[i] == key) {
                 while(j < nums.length && j <= (i + k)){
                     if(Math.abs(j - i) <= k){
                         numsList.add(j);
                     }
                     j++;
                 }
             }
         }
        return numsList;
    }

    public static void main(String[] args) {
        int [] nums = {2,2,2,2,2};

        findKDistantIndices(nums, 2, 2).forEach(System.out::println);
    }
}

package leetcode.easy.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DivideArrayIntoEqualPairs {

    public static boolean divideArray(int[] nums) {
        Map<Integer, Integer> frequencyMapper = new HashMap<>();
        for(int num: nums) {
            frequencyMapper.put(num, frequencyMapper.getOrDefault(num, 0)+1);
        }
        for(Integer key: frequencyMapper.keySet()) {
            if(frequencyMapper.get(key)%2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        System.out.println(divideArray(nums));
    }
}

package leetcode.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate != null ? candidate : 0;
        /*Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for(Integer key : map.keySet()){
            if( map.get(key)> nums.length / 2)
                return key;
        }

        return 0;*/
    }

    public static void main(String[] args) {
        int[] array = {3,2,4};
        System.out.println(majorityElement(array));
    }
}

package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArrayWithNoExtraSpace {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 3, 8, 7, 2, 3, 6};
        List<Integer> duplicates = findDuplicates(numbers);
        duplicates.forEach(System.out::println);
    }

    private static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicatesArray = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
                int index = Math.abs(nums[i]) - 1;
                if(nums[index] > 0)
                    nums[index] = -1 * nums[index];
                else
                    duplicatesArray.add(index+1);
            }
        return duplicatesArray;
    }
}

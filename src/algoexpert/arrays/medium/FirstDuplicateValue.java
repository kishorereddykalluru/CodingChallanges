package algoexpert.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {

    // O(n^2) time | O(1) space - where n is the length of array
    public int firstDuplicateValue(int[] array) {
        int minimumSecondIndex = array.length;
        for(int i = 0; i < array.length; i++){
            int value = array[i];
            for(int j = i + 1; j < array.length; j++){
                int valueToCompare = array[j];
                if(value == valueToCompare) {
                    minimumSecondIndex = Math.min(minimumSecondIndex, j);
                }
            }
        }
        if(minimumSecondIndex == array.length){
            return -1;
        }
        return array[minimumSecondIndex];
    }

    // O(n) time | O(n) space - where n is the length of array
    public int firstDuplicateValue1(int[] array) {
        Set<Integer> numbers = new HashSet<>();
        for(int num: array){
            if(numbers.contains(num)){
                return num;
            } else {
                numbers.add(num);
            }
        }
        return -1;
    }

    // O(n) time | O(1) space - where n is the length of array
    public int firstDuplicateValue2(int[] array) {
        for(int value: array){
            int absValue = Math.abs(value);
            if(array[absValue - 1] < 0) return absValue;
            array[absValue - 1] *= -1;
        }
        return -1;
    }



    public static void main(String[] args) {


    }
}

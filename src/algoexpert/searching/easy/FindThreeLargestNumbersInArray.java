package algoexpert.searching.easy;

import java.util.Arrays;

public class FindThreeLargestNumbersInArray {
    public static int[] findThreeLargestNumbers(int[] array) {
        int [] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for(int idx = 0; idx < array.length; idx++){
            if(array[idx] > result[2]){
                result[0] = result[1];
                result[1] = result[2];
                result[2] = array[idx];
            } else if(array[idx] > result[1]){
                result[0] = result[1];
                result[1] = array[idx];
            } else if(array[idx] > result[0]){
                result[0] = array[idx];
            }
        }
        return result;
    }

    public static int[] findThreeLargestNumbers_updated(int[] array) {
        int [] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for(int num: array){
            updateThreeLargest(result, num);
        }
        return result;
    }

    public static int[] updateThreeLargest(int[] result, int num){
        if(num > result[2]){
            shiftAndUpdate(result, num, 2);
        } else if(num > result[1]){
            shiftAndUpdate(result, num, 1);
        } else if( num > result[0]){
            shiftAndUpdate(result, num, 0);
        }
        return result;
    }

    public static void shiftAndUpdate(int [] result, int num, int index){
        for(int i = 0; i <= index; i++){
            if(i == index){
                result[i] = num;
            } else {
                result[i] = result[i+1];
            }
        }
    }

    public static void main(String[] args) {
        int [] result = findThreeLargestNumbers_updated(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7});

        Arrays.stream(result).forEach(System.out::println);
    }
}

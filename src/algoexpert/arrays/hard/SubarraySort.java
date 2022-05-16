package algoexpert.arrays.hard;

/**
 * Write a function that takes in an array of at least two integers and that returns an array of the starting
 * and ending indices of the smallest subarray in the input array that needs to be sorted in place in order for the
 * entire input array to be sorted (in ascending order).
 *
 * If the input array is already sorted, the function should return [-1, -1]
 *
 * sample input
 * array = [1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19]
 * sample output
 * [3, 9]
 */
public class SubarraySort {

    public static int[] subarraySort(int[] array){
        int minOurofOrder = Integer.MAX_VALUE;
        int maxOutofOrder = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            int num = array[i];
            if(isOutofOrder(i, num, array)) {
                minOurofOrder = Math.min(minOurofOrder, num);
                maxOutofOrder = Math.max(maxOutofOrder, num);
            }
        }
        if(minOurofOrder == Integer.MAX_VALUE){
            return new int[] {-1,-1};
        }
        int subarrayLeftIdx = 0;
        while(minOurofOrder >= array[subarrayLeftIdx]){
            subarrayLeftIdx++;
        }

        int subarrayRightIdx = array.length - 1;
        while(maxOutofOrder <= array[subarrayRightIdx]) {
            subarrayRightIdx--;
        }
        return new int[] {subarrayLeftIdx, subarrayRightIdx};
    }


    public static boolean isOutofOrder(int i, int num, int[] array){
        if(i == 0){
            return num > array[i+ 1];
        }
        if(i  == array.length - 1){
            return num < array[i - 1];
        }

        return num > array[i + 1] || num < array[i - 1];
    }

    public static void main(String[] args) {
        int[] subarray = subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19});
        for(int num: subarray){
            System.out.println("num = " + num);
        }
    }
}

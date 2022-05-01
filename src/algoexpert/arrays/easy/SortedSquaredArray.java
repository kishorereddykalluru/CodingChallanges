package algoexpert.arrays.easy;

import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        int smallIndex = 0;
        int largeIndex = array.length -1;
        int[] sortedArray = new int[array.length];
        for( int idx = array.length -1; idx >= 0; idx--){
            int smallValue = array[smallIndex];
            int largeValue = array[largeIndex];
            if(Math.abs(smallValue) > Math.abs(largeValue)) {
                sortedArray[idx] = smallValue * smallValue;
                smallIndex++;
            } else {
                sortedArray[idx] = largeValue * largeValue;
                largeIndex--;
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        Arrays.stream(sortedSquaredArray(new int[] {-5, 1, 2, 3, 6, 8, 9})).forEach(System.out::println);
    }
}

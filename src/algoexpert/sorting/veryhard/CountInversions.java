package algoexpert.sorting.veryhard;

import java.util.ArrayList;
import java.util.List;

public class CountInversions {

    public static int countInversions(int[] array){
        return countSubArrayInversions(array, 0, array.length);
    }

    public static int countSubArrayInversions(int[] array, int start, int end){
        if(end - start <= 1)
            return 0;

        int middle = start + (end - start) / 2;
        int leftInversions = countSubArrayInversions(array, start, middle);
        int rightInversions = countSubArrayInversions(array, middle, end);
        int mergedArrayInversions = mergeSortAndCountInversions(array, start, middle, end);
        return leftInversions + rightInversions + mergedArrayInversions;
    }

    public static int mergeSortAndCountInversions(int[] array, int start, int middle, int end) {
        List<Integer> sortedArray = new ArrayList<>();
        int left = start;
        int right = middle;
        int inversions = 0;

        while(left < middle && right < end) {
            if(array[left] <= array[right]) {
                sortedArray.add(array[left]);
                left += 1;
            } else {
                inversions += middle - left;
                sortedArray.add(array[right]);
                right += 1;
            }
        }

        for (int idx = left; idx < middle; idx++) {
            sortedArray.add(array[idx]);
        }

        for(int idx = right; idx < end; idx++){
            sortedArray.add(array[idx]);
        }

        for (int idx = 0; idx < sortedArray.size(); idx++) {
            int num = sortedArray.get(idx);
            array[start + idx] = num;
        }

        return inversions;
    }


    public static void main(String[] args) {

        System.out.println(countInversions(new int[]{2,3,3,1,9,5,6}));
    }
}

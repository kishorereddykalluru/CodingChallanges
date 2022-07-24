package algoexpert.sorting.hard;

/**
 * Best: O(nlog(n)) time | O(log(n)) space
 * Average: O(nlog(n)) time | O(log(n)) space
 * Worst: O(n^2) time | O(log(n)) space
 */

public class QuickSort {

    public static int[] quicksort(int[] array){
        quicksort(array, 0, array.length - 1);
        return array;
    }

    public static void quicksort(int[] array, int startIdx, int endIdx){
        if(startIdx >= endIdx)
            return;

        int pivotIdx = startIdx;
        int leftIdx = startIdx + 1;
        int rightIdx = endIdx;

        while(rightIdx >= leftIdx) {
            if(array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]) {
                swap(leftIdx, rightIdx, array);
            }

            if(array[leftIdx] <= array[pivotIdx]){
                leftIdx += 1;
            }
            if(array[rightIdx] >= array[pivotIdx]){
                rightIdx -= 1;
            }
        }

        swap(pivotIdx, rightIdx, array);
        boolean leftSubarrayIsSmaller = rightIdx - 1 - startIdx < endIdx - (rightIdx + 1);

        if(leftSubarrayIsSmaller){
            quicksort(array, startIdx, rightIdx - 1);
            quicksort(array, rightIdx + 1, endIdx);
        } else {
            quicksort(array, rightIdx + 1, endIdx);
            quicksort(array, startIdx, rightIdx - 1);
        }
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }


    public static void main(String[] args) {

        int result[] = quicksort(new int[]{8,5,2,9,5,6,3});

        for(int r: result)
            System.out.print(r+" ");
    }
}

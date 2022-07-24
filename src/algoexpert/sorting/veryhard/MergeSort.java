package algoexpert.sorting.veryhard;

import java.util.Arrays;


public class MergeSort {

    /**
     * Best: O(nlog(n)) time | O(nlog(n)) space
     * Average: O(nlog(n)) time | O(nlog(n)) space
     * Worst: O(nlog(n)) time | O(nlog(n)) space
     */
    public static int[] mergesort(int[] array) {
        if(array.length <= 1) {
            return array;
        }

        int middleIdx = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, middleIdx);
        int[] rightHalf = Arrays.copyOfRange(array, middleIdx, array.length);
        return mergeSortedArrays(mergesort(leftHalf), mergesort(rightHalf));
    }

    public static int[]  mergeSortedArrays(int[] leftHalf, int[] rightHalf) {
        int[] sortedArray = new int[leftHalf.length + rightHalf.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < leftHalf.length && j < rightHalf.length) {
            if(leftHalf[i] <= rightHalf[j]) {
                sortedArray[k++] = leftHalf[i++];
            } else {
                sortedArray[k++] = rightHalf[j++];
            }
        }

        while (i < leftHalf.length) {
            sortedArray[k++] = leftHalf[i++];
        }

        while(j < rightHalf.length) {
            sortedArray[k++] = rightHalf[j++];
        }

        return sortedArray;
    }

    /**
     * Best: O(nlog(n)) time | O(n) space
     * Average: O(nlog(n)) time | O(n) space
     * Worst: O(nlog(n)) time | O(n) space
     */

    public static int[] mergesort1(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int[] auxiliaryArray = array.clone();
        mergesort1(array, 0, array.length - 1, auxiliaryArray);
        return array;
    }

    public static void mergesort1(int[] mainArray, int startIdx, int endIdx, int[] auxiliaryArray) {
        if(startIdx == endIdx) {
            return;
        }
        int middleIdx = (startIdx + endIdx) / 2;
        mergesort1(auxiliaryArray, startIdx, middleIdx, mainArray);
        mergesort1(auxiliaryArray, middleIdx, endIdx, mainArray);

        doMerge(mainArray, startIdx, middleIdx, endIdx, auxiliaryArray);
    }

    public static void doMerge(int[] mainArray, int startIdx, int middleIdx, int endIdx, int[] auxiliaryArray) {
        int k = startIdx;
        int i = startIdx;
        int j = endIdx;

        while(i <= middleIdx && j <= endIdx) {
            if(auxiliaryArray[i] <= auxiliaryArray[j]) {
                mainArray[k++] = auxiliaryArray[i++];
            } else {
                mainArray[k++] = auxiliaryArray[j++];
            }
        }

        while(i <= middleIdx) {
            mainArray[k++] = auxiliaryArray[i++];
        }
        while(j <= endIdx) {
            mainArray[k++] = auxiliaryArray[j++];
        }
    }

    public static void main(String[] args) {

        int result[] = mergesort(new int[]{8,5,2,9,5,6,3});

        for(int r: result)
            System.out.print(r+" ");
    }
}

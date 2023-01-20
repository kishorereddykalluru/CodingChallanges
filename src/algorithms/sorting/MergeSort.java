package algorithms.sorting;

public class MergeSort {

    public static void main(String[] args) {

        //int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] intArray = {20, 35};
        mergeSort(intArray, 0, intArray.length);

        for(int num: intArray){
            System.out.println("num = " + num);
        }
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(end - start < 2)
            return;

        int mid = (start+end)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end){

        if(array[mid-1] <= array[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while(i < mid && j < end)
        {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}

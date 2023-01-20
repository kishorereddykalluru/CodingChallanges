package algorithms.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);
        for(int num: intArray){
            System.out.println("num = " + num);
        }
    }

    private static void quickSort(int[] input, int start, int end){

        if(end - start <  2)
            return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;


        while(i < j){
            //Empty loop we traverse from end
            //to check of value which is less than pivot
            while(i < j && input[--j] >= pivot);
            //if found then swap it
            if(i < j){
                input[i] = input[j];
            }

            while(i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;

    }
}

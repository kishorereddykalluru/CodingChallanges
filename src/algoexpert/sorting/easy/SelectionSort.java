package algoexpert.sorting.easy;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        if(arr.length == 0)
            return new int[]{};
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    min = j;
                }
                if(min != i){
                    swap(arr, i, min);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] array, int i, int min){
        int temp = array[min];
        array[min] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {7, 4, 6, 10, 3, 1};

        int[] result = selectionSort(arr);

        for(int r: result){
            System.out.println(r);
        }
    }
}

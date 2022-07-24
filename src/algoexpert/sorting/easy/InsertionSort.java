package algoexpert.sorting.easy;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        if(arr.length == 0)
            return new int[] {};

        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static int[] insertionSort_algo(int[] arr){
        if(arr.length == 0)
            return new int[] {};

        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                swap(j, j-1, arr);
                j--;
            }
        }
        return arr;
    }

    public static void swap(int first, int last, int[] arr){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {7, 4, 6, 10, 3, 1};

        int[] result = insertionSort_algo(arr);

        for(int r: result){
            System.out.println(r);
        }
    }
}

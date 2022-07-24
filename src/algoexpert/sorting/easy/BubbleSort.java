package algoexpert.sorting.easy;

/*
* bubble sort
* Worst Case: O(n^2)
* Average Case: O(n^2)
* Best Case: O(n)
*/
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        if(arr.length == 0)
            return new int[] {};

        boolean flag = false;
        int counter = 0;

        while(!flag) {
            flag = true;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    flag = false;
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {7, 4, 6, 10, 3, 1};

       int[] result = bubbleSort(arr);

       for(int r: result){
           System.out.println(r);
       }
    }
}

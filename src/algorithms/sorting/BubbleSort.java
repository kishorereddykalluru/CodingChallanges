package algorithms.sorting;

public class     BubbleSort {

    public static void main(String[] args) {

        int arr[] = {20, 35, -15, 7, 55, 1, -22};

        for(int lastIndex = arr.length -1; lastIndex > 0; lastIndex--){
            for(int i = 0; i < lastIndex; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i+1, i);
                }
            }
        }
        
        for (int num : arr){
            System.out.println(num);
        }
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        
    }


}

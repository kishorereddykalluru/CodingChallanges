package algorithms.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastIndex = intArray.length-1; lastIndex > 0; lastIndex--){
            int largest = 0;
            for(int i = 1; i <= lastIndex; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastIndex);
        }

        for(int num : intArray){
            System.out.println("num = " + num);
        }
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

package algorithms.sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int intArray[] = {20, 35, -15, 7, 55, 1, -22};
        for(int firstIndex = 1; firstIndex < intArray.length; firstIndex++){
            int newElement = intArray[firstIndex];
            int i;
            for(i = firstIndex; i > 0 && newElement < intArray[i-1]; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        for(int num: intArray){
            System.out.println("num = " + num);
        }
    }
}

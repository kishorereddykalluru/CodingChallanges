package algorithms.sorting;

public class ShellSort {
    public static void main(String[] args) {
        int intArray[] = {45, 20, 60, 80, 1, 48, 35, 99, 53, 29, 49, 27};

        for(int gap = intArray.length/2; gap > 0; gap/=2){
            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j = i;
                while(j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        for(int num: intArray){
            System.out.println("num = " + num);
        }
    }
}

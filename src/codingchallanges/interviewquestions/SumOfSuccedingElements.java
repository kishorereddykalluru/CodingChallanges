package codingchallanges.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Genesys
 */
public class SumOfSuccedingElements {

    public static void main(String[] args) {

        //24, 2, 10, 4, 3, 2, 1
        //Op: 2 and 4

        int[] arr = {24, 2, 10, 4, 3, 2, 1};

        int[] ints = indexOfSumOfSuccedingElements(arr);
        Arrays.stream(ints).forEach(System.out::println);

    }

    public static int[] indexOfSumOfSuccedingElements(int[] arr){

        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            int j = i+1;
            int element = 0;
            while(j < arr.length){
                element += arr[j];
                j++;
            }

            if(arr[i] == element){
                integers.add(i);
            }

            if(integers.size() == 0){
                return  new int[]{-1};
            }
        }
        return  new int[integers.size()];
    }

}

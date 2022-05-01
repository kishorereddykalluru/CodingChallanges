package algoexpert.arrays.easy;

import java.util.List;

public class ValidSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if(array.size() == 0 && sequence.size() > array.size()) return false;
        int j = 0;
        for(int i = 0; i < array.size(); i++){
            if(array.get(i) == sequence.get(j)){
                if(j == sequence.size() - 1){
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {


    }
}

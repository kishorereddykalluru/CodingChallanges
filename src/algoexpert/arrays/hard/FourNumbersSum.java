package algoexpert.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumbersSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        Map<Integer, List<Integer[]>> allPairsSum = new HashMap<>();
        List<Integer[]>  quadruplets = new ArrayList<>();

        for(int i = 1; i < array.length -1; i++){
            for(int j = i + 1; j < array.length; j++){
                int currentSum = array[i] + array[j];
                int difference = targetSum - currentSum;
                if(allPairsSum.containsKey(difference)){
                    for(Integer[] pair: allPairsSum.get(difference)){
                        Integer[] newQuadruplet = {pair[0], pair[1], array[i], array[j]};
                        quadruplets.add(newQuadruplet);
                    }
                }
            }
            for(int k = 0; k < i; k++){
                int currentSum = array[i] + array[k];
                Integer[] pair = {array[k], array[i]};
                if(!allPairsSum.containsKey(currentSum)){
                    List<Integer[]> pairGroup = new ArrayList<>();
                    pairGroup.add(pair);
                    allPairsSum.put(currentSum, pairGroup);
                } else {
                    allPairsSum.get(currentSum).add(pair);
                }
            }
        }
        return quadruplets;
    }

    public static void main(String[] args) {
        List<Integer[]> quadruplets = fourNumberSum(new int[] {7, 6, 4, -1, 1, 2}, 16);
        quadruplets.forEach(e -> {
            for(int num: e){
                System.out.println(num);
            }
            System.out.println();
        });
    }
}

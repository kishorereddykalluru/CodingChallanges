package algoexpert.arrays.easy;

import java.util.Arrays;

public class NonConstructableChange {

    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentChange = 0;
        for(int coin : coins) {
            if(coin > currentChange + 1){
                return currentChange + 1;
            }
            currentChange += coin;
        }

        return currentChange + 1;
    }

    public static void main(String[] args) {

        System.out.println(nonConstructibleChange(new int[] {1}));

    }
}

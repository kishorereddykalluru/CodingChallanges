package algoexpert.recursion.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class StaircaseTraversal {

    // O(k^n) time | O(n) space - when n is the height of the staircase and k is the number of allowed steps
    public static int staircaseTraversal(int height, int maxSteps) {
        return numberOfWaysToTop(height, maxSteps);
    }

    public static int numberOfWaysToTop(int height, int maxSteps) {
        if(height <= 1) {
            return 1;
        }

        int numberOfWays = 0;
        for(int step = 1; step < Math.min(maxSteps, height) + 1; step++) {
            numberOfWays += numberOfWaysToTop(height - step, maxSteps);
        }
        return numberOfWays;
    }


    // O(k * n) time | O(n) space - when n is the height of the staircase and k is the number of allowed steps
    public static int staircaseTraversal1(int height, int maxSteps) {
        HashMap<Integer, Integer> memorize = new HashMap<>();
        memorize.put(0,1);
        memorize.put(1,1);
        return numberOfWaysToTop(height, maxSteps, memorize);
    }

    public static int numberOfWaysToTop(int height, int maxSteps, HashMap<Integer, Integer> memorize) {
        if(memorize.containsKey(height)) {
            return memorize.get(height);
        }

        int numberOfWays = 0;
        for(int step = 1; step < Math.min(maxSteps, height) + 1; step++) {
            numberOfWays += numberOfWaysToTop(height - step, maxSteps, memorize);
        }

        memorize.put(height, numberOfWays);
        return numberOfWays;
    }

    // O(k * n) time | O(n) space - when n is the height of the staircase and k is the number of allowed steps
    public static int staircaseTraversal2(int height, int maxSteps) {
        int[] waysToTop = new int[height + 1];
        waysToTop[0] = 1;
        waysToTop[1] = 1;

        for(int currentHeight = 2; currentHeight < height + 1; currentHeight++) {
            int step = 1;
            while(step <= maxSteps && step <= currentHeight) {
                waysToTop[currentHeight] = waysToTop[currentHeight] + waysToTop[currentHeight - step];
                step += 1;
            }
        }
        return waysToTop[height];
    }

    //O(n) time | O(n) space - where n is the height of the staircase
    public static int staircaseTraversal3(int height, int maxSteps) {
        int currentNumberOfWays = 0;
        ArrayList<Integer> waysToTop = new ArrayList<>();
        waysToTop.add(1);

        for(int currentHeight = 1; currentHeight < height + 1; currentHeight++) {
            int startOfWindow = currentHeight - maxSteps - 1;
            int endOfWindow = currentHeight - 1;

            if(startOfWindow >= 0) {
                currentNumberOfWays -= waysToTop.get(startOfWindow);
                waysToTop.add(currentNumberOfWays);
            }

            currentNumberOfWays += waysToTop.get(endOfWindow);
            waysToTop.get(currentNumberOfWays);
        }

        return waysToTop.get(height);
    }

    public static void main(String[] args) {


    }
}

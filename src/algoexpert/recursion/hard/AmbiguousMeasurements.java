package algoexpert.recursion.hard;

import java.util.HashMap;

public class AmbiguousMeasurements {

    //O(low * high * n) time | O(low * high) space - where n is the number of measuring cups
    public static boolean ambiguousMeasurements(int[][] measuringCups, int low, int high) {
        HashMap<String, Boolean> memorization = new HashMap<>();
        return canMeasureInRange(measuringCups, low, high, memorization);
    }

    public static boolean canMeasureInRange(int[][] measuringCups, int low, int high, HashMap<String, Boolean> memorization)  {
        String memorizeKey = createHashtableKey(low, high);
        if(memorization.containsKey(memorizeKey)) {
            return memorization.get(memorizeKey);
        }

        if(low <= 0 && high <= 0) {
            return false;
        }

        boolean canMeasure = false;
        for (int[] cup: measuringCups) {
            int cupLow = cup[0];
            int cupHigh = cup[1];

            if(low <= cupLow && cupHigh <= high) {
                canMeasure = true;
                break;
            }

            int newLow = Math.max(0, low - cupLow);
            int newHigh = Math.max(0, high - cupHigh);
            canMeasure = canMeasureInRange(measuringCups, newLow, newHigh, memorization);
            if(canMeasure) break;
        }

        memorization.put(memorizeKey, canMeasure);
        return canMeasure;
    }

    public static String createHashtableKey(int low, int high) {
        return low + ":" + high;
    }

    public static void main(String[] args) {


    }
}

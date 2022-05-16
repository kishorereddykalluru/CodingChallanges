package algoexpert.arrays.veryhard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ApartmentHunting {

    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {
        int[] maxDistanceAtBlocks = new int[blocks.size()];
        Arrays.fill(maxDistanceAtBlocks, Integer.MIN_VALUE);

        for (int i = 0; i < blocks.size(); i++) {
            for (String req : reqs) {
                int closestReqDistance = Integer.MAX_VALUE;
                for (int j = 0; j < blocks.size(); j++) {
                    if (blocks.get(j).get(req)) {
                        closestReqDistance = Math.min(closestReqDistance, closestBetween(i, j));
                    }
                }
                maxDistanceAtBlocks[i] = Math.max(maxDistanceAtBlocks[i], closestReqDistance);
            }
        }
        return getIdxAtMinValue(maxDistanceAtBlocks);
    }

    private static int getIdxAtMinValue(int[] maxDistanceAtBlocks) {
        int idxAtMinValue = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < maxDistanceAtBlocks.length; i++){
            int currentValue = maxDistanceAtBlocks[i];
            if(currentValue < minValue) {
                minValue = currentValue;
                idxAtMinValue = i;
            }
        }
        return idxAtMinValue;
    }

    private static int closestBetween(int i, int j) {
        return Math.abs(i - j);
    }

    public static void main(String[] args) {

    }
}

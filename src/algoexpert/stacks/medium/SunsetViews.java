package algoexpert.stacks.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SunsetViews {

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> buildingsWithSunsetViews = new ArrayList<>();

        int startIdx = buildings.length - 1;
        int step = -1;

        if(direction.equals("WEST")) {
            startIdx = 0;
            step = 1;
        }

        int idx = startIdx;
        int runnningMaxHeight = 0;

        while( idx >= 0 && idx < buildings.length) {
            int buildingHeight = buildings[idx];

            if(buildingHeight > runnningMaxHeight) {
                buildingsWithSunsetViews.add(idx);
            }

            runnningMaxHeight = Math.max(runnningMaxHeight, buildingHeight);

            idx += step;
        }

        if(direction.equals("EAST")) {
            Collections.reverse(buildingsWithSunsetViews);
        }

        return buildingsWithSunsetViews;
    }

    public static ArrayList<Integer> sunsetViews1(int[] buildings, String direction) {
        ArrayList<Integer> candidateBuildings = new ArrayList<>();

        int startIdx = buildings.length - 1;
        int step = -1;

        if(direction.equals("EAST")) {
            startIdx = 0;
            step = 1;
        }

        int idx = startIdx;


        while( idx >= 0 && idx < buildings.length) {
            int buildingHeight = buildings[idx];

            while(candidateBuildings.size() > 0
                && buildings[candidateBuildings.get(candidateBuildings.size() - 1)] <= buildingHeight) {
                candidateBuildings.remove(candidateBuildings.size() - 1);
            }

            candidateBuildings.add(idx);

            idx += step;
        }

        if(direction.equals("WEST")) {
            Collections.reverse(candidateBuildings);
        }

        return candidateBuildings;
    }

    public static void main(String[] args) {

        ArrayList<Integer> result = sunsetViews1(new int[]{3,5,4,4,3,1,3,2}, "EAST");

        for(int r: result)
            System.out.println(r + " ");
    }
}

package algoexpert.arrays.easy;

import java.util.*;

public class TournmentWinner {
    // original written
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<String, Integer> frequencyMap = new HashMap<>();
        String winner = "";
        int max = 0;
        for(int idx = 0; idx < results.size(); idx++){
            List<String> individual = competitions.get(idx);
            if(results.get(idx) == 0 ) winner = individual.get(1);
            else winner = individual.get(0);
            frequencyMap.put(winner, frequencyMap.getOrDefault(winner, 0) + 3);
        }
        for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() > max) {
                max = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner;
    }

    //optimized
    public static String tournamentWinner_optimized(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Map<String, Integer> frequencyMap = new HashMap<>();
        String winner = "";
        frequencyMap.put(winner, 0);
        for(int idx = 0; idx < results.size(); idx++){
            List<String> competition = competitions.get(idx);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String s = (results.get(idx) == 0) ? awayTeam : homeTeam;
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 3);

            if(frequencyMap.get(s) > frequencyMap.get(winner)){
                winner = s;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        ArrayList<String> competetors1 = new ArrayList<>(Arrays.asList(new String[]{"HTML", "JAVA"}));
        ArrayList<String> competetors2 = new ArrayList<>(Arrays.asList(new String[]{"JAVA", "Python"}));
        ArrayList<String> competetors3 = new ArrayList<>(Arrays.asList(new String[]{"Python", "HTML"}));
        var competetorList = new ArrayList<ArrayList<String>>();
        competetorList.add(competetors1);
        competetorList.add(competetors2);
        competetorList.add(competetors3);
        System.out.println(tournamentWinner(competetorList, new ArrayList<>(Arrays.asList(0,1,1))));
    }
}

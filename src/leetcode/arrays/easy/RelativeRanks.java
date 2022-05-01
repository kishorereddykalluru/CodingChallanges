package leetcode.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    /**
     * My Solution
     * @param score
     * @return
     */
    public static String[] findRelativeRanks1(int[] score) {
        String [] resultRanks = new String[score.length];
        int k = 1;
        int max = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < score.length; i++){
            int num = 0;
            for(int j = 0 ; j < score.length; j++) {
                if (score[j] < max && score[j] > num) {
                    num = score[j];
                    index = j;
                }
            }
            if(k == 1) resultRanks[index] = "Gold Medal";
            else if(k == 2) resultRanks[index] = "Silver Medal";
            else if(k == 3) resultRanks[index] = "Bronze Medal";
            else resultRanks[index] = String.valueOf(k);
            k++;
            max = num;
        }
        return resultRanks;
    }

    /**
     * Internet solution
     * @param score
     * @return
     */
    public static String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int[] temp = score.clone(); //  we need to clone array to sort cloned array and leave original array order
        Arrays.sort(temp);
        int count = 1; // this int will help in creating a String count inside HashMap
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = score.length - 1; i >= 0; i--){
            map.put(temp[i], Integer.toString(count++)); // temp array sorted so from the end of array
            // we have biggest numbers
        }
        for(int j = 0; j < score.length; j++){ // we need the second for loop to check every number inside
            // HashMap, all keys are have needed string values
            if(map.get(score[j]).equals("1")){
                answer[j] = "Gold Medal";
            }
            else if(map.get(score[j]).equals("2")){
                answer[j] = "Silver Medal";
            }
            else if(map.get(score[j]).equals("3")){
                answer[j] = "Bronze Medal";
            }
            else{
                answer[j] = map.get(score[j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String [] str = findRelativeRanks(new int[] {10,3,8,9,4});
        Arrays.stream(str).forEach(System.out::println);
    }
}

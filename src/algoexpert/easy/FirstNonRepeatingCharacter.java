package algoexpert.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    /**
     * first non repeating characters
     *
     *  time complexity: O(n*n (n-square))
     *  space complexity: O(n)
     *
     *
     * @param string
     * @return int
     */
    public static int bruteForce(String string) {
        if(string.length() == 0) return -1;
        if(string.length() < 2) return 1;

        for(int i = 0; i < string.length(); i++){
            boolean duplicate = false;
            for(int j = 0; j < string.length(); j++){
                if(i != j  && string.charAt(i) == string.charAt(j)) duplicate = true;
            }
            if(!duplicate) return i;
        }
        return -1;
    }

    /**
     * first non repeating characters
     *
     *  time complexity: O(n)
     *  space complexity: O(1)
     *
     *
     * @param string
     * @return int
     */
    public static int firstNonRepeatingIndex(String string){
        Map<Character, Integer> frequencyMap = new HashMap<>();
        if(string.length() == 0) return -1;
        for(Character c: string.toCharArray()){
            if(!frequencyMap.containsKey(c)){
                frequencyMap.put(c, 1);
            } else {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            }
        }

        for(int i = 0; i < string.length(); i++){
            if(frequencyMap.get(string.charAt(i)) == 1) return i;
        }

        return -1;
    }
    public static void main(String[] args) {

        String s = "ababac";

        //System.out.println(bruteForce(s));
        System.out.println(firstNonRepeatingIndex(s));

    }
}

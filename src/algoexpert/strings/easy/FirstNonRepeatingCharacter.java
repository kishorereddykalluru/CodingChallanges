package algoexpert.strings.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < string.length(); i++) {
            frequencyMap.put(string.charAt(i), frequencyMap.getOrDefault(string.charAt(i), 0) + 1);
        }

        for(int i = 0; i < string.length(); i++){
            if(frequencyMap.get(string.charAt(i)) == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "abcdcaf";
        System.out.println(firstNonRepeatingCharacter(str));
    }
}

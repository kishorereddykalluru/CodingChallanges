package algoexpert.strings.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {

    public static boolean generateDocument(String characters, String document) {
        Map<Character, Integer> characterFrequency = new HashMap<>();

        for(Character character: characters.toCharArray()){
            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0) + 1);
        }

        for(int idx = 0; idx < document.length(); idx++){
            if(!characterFrequency.containsKey(document.charAt(idx)) || characterFrequency.get(document.charAt(idx)) == 0 ) return false;

            characterFrequency.put(document.charAt(idx), characterFrequency.get(document.charAt(idx)) - 1);
        }
        return true;
    }

    public static boolean generateDocument1(String characters, String document) {
        Map<Character, Integer> characterFrequency = new HashMap<>();

        for(Character character: characters.toCharArray()){
            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0) + 1);
        }


        for(int idx = 0; idx < document.length(); idx++){
            if(!characterFrequency.containsKey(document.charAt(idx)) || characterFrequency.get(document.charAt(idx)) == 0 ) return false;

            characterFrequency.put(document.charAt(idx), characterFrequency.get(document.charAt(idx)) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(generateDocument1("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
    }
}

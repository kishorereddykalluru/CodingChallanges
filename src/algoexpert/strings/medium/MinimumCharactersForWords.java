package algoexpert.strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumCharactersForWords {

    public char[] minimumCharactersForWords(String[] words){
        Map<Character, Integer> maximumCharacterFrequencies = new HashMap<>();

        for(String word: words){
            HashMap<Character, Integer> characterFrequencies = countCharacterFrequencies(word);
            updateMaximumFrequencies(characterFrequencies, maximumCharacterFrequencies);
        }
        return makeArrayFromCharacterFrequencies(maximumCharacterFrequencies);
    }

    private char[] makeArrayFromCharacterFrequencies(Map<Character, Integer> maximumCharacterFrequencies) {
        ArrayList<Character> characters = new ArrayList<>();
        for(Map.Entry<Character, Integer> frequeny: maximumCharacterFrequencies.entrySet()){
            char character = frequeny.getKey();
            int characterFrequency = frequeny.getValue();

            for(int idx = 0; idx < characterFrequency; idx++){
                characters.add(character);
            }
        }

        char[] charactersArray = new char[characters.size()];
        for(int idx = 0; idx < characters.size(); idx++){
            charactersArray[idx] = characters.get(idx);
        }

        return charactersArray;
    }

    public void updateMaximumFrequencies(HashMap<Character, Integer> characterFrequencies, Map<Character, Integer> maximumCharacterFrequencies) {
        for(Map.Entry<Character, Integer> frequency: characterFrequencies.entrySet()){
            char character = frequency.getKey();
            int characterFrequency = frequency.getValue();

            if(maximumCharacterFrequencies.containsKey(character)){
                maximumCharacterFrequencies.put(character, Math.max(characterFrequency, maximumCharacterFrequencies.get(character)));
            } else {
                maximumCharacterFrequencies.put(character, characterFrequency);
            }
        }
    }

    public HashMap<Character, Integer> countCharacterFrequencies(String string) {
        HashMap<Character, Integer> characterFrequencies = new HashMap<>();
        for(char character: string.toCharArray()){
            characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) + 1);
        }
        return characterFrequencies;
    }

    public static void main(String[] args) {
        MinimumCharactersForWords m = new MinimumCharactersForWords();
        String[] words = {"this", "that", "did", "deed", "them!", "a"};

        char[] chars = m.minimumCharactersForWords(words);
        for(char c: chars){
            System.out.print(c + " ");
        }
    }
}

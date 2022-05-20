package algoexpert.strings.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {

        if(words.size() == 0) return new ArrayList<>();

        List<String> sortedWords = new ArrayList<>();
        for(String word: words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            sortedWords.add(sortedWord);
        }

        List<Integer> indices = IntStream.range(0, words.size()).boxed().collect(Collectors.toList());
        //indices.sort((a,b) -> sortedWords.get(a).compareTo(sortedWords.get(b)));
        indices.sort(Comparator.comparing(sortedWords::get));

        List<List<String>> result = new ArrayList<>();
        List<String> currentAnagramGroup = new ArrayList<>();
        String currentAnagram = sortedWords.get(indices.get(0));
        for(Integer index: indices) {
            String word = words.get(index);
            String sortedWord = sortedWords.get(index);

            if(sortedWord.equals(currentAnagram)){
                currentAnagramGroup.add(word);
                continue;
            }

            result.add(currentAnagramGroup);
            currentAnagramGroup = new ArrayList<>(Arrays.asList(word));
            currentAnagram = sortedWord;
        }

        result.add(currentAnagramGroup);
        return result;
    }

    public static List<List<String>> groupAnagrams1(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if(anagrams.containsKey(sortedWord)){
                anagrams.get(sortedWord).add(word);
            } else {
                anagrams.put(sortedWord, new ArrayList<>(Arrays.asList(word)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        var words = Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp");
        List<List<String>> lists = groupAnagrams(words);
        System.out.println(lists);
    }
}

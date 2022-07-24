package algoexpert.tries.hard;

import java.util.*;

public class MultiStringSearch {

    // O(bns) time | O(n) space
    public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
        List<Boolean> solution = new ArrayList<>();
        for(String smallString: smallStrings) {
            solution.add(isInBigString(bigString, smallString));
        }

        return solution;
    }

    public static boolean isInBigString(String bigString, String smallString) {
        for(int i = 0 ; i < bigString.length(); i++) {
            if( i + smallString.length() > bigString.length()) {
                break;
            }
            if( isInBigString(bigString, smallString, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInBigString(String bigString, String smallString, int startIdx) {
        int leftBigIdx = startIdx;
        int rightBigIdx = startIdx + smallString.length() - 1;
        int leftSmallIdx = 0;
        int rightSmallIdx = smallString.length() - 1;

        while(leftBigIdx <= rightBigIdx) {
            if( bigString.charAt(leftBigIdx) != smallString.charAt(leftSmallIdx) ||
                bigString.charAt(rightBigIdx) != smallString.charAt(rightSmallIdx)) {
                return false;
            }
            leftBigIdx++;
            rightBigIdx--;
            leftSmallIdx++;
            rightSmallIdx--;
        }

        return true;
    }

    // O(b^2 + ns) time | O(b^2 + n) space
    public static List<Boolean> multiStringSearch1(String bigString, String[] smallStrings) {
        ModifiedSuffixTrie modifiedSuffixTrie = new ModifiedSuffixTrie(bigString);
        List<Boolean> solution = new ArrayList<>();
        for(String smallString: smallStrings) {
            solution.add(modifiedSuffixTrie.contains(smallString));
        }
        return solution;
    }

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    static class ModifiedSuffixTrie {
        TrieNode root = new TrieNode();

        public ModifiedSuffixTrie(String str) {
            populateModifiedSuffixTrieFrom(str);
        }

        public void populateModifiedSuffixTrieFrom(String str) {
            for( int i = 0; i < str.length(); i++) {
                insertSubstringStartingAt(i, str);
            }
        }

        public void insertSubstringStartingAt(int i, String str) {
            TrieNode node = root;
            for(int j = i; j < str.length(); j++) {
                char letter = str.charAt(j);
                if (!node.children.containsKey(letter)) {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                }
                node = node.children.get(letter);
            }
        }

        public boolean contains(String str) {
            TrieNode node = root;
            for(int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if( !node.children.containsKey(letter)) {
                    return false;
                }
                node = node.children.get(letter);
            }
            return true;
        }
    }

    // O(ns + bs) time | O(ns) space
    public static List<Boolean> multiStringSearch2(String bigString, String[] smallStrings) {
        Trie trie = new Trie();
        for (String smallString: smallStrings) {
            trie.insert(smallString);
        }

        Set<String> containedStrings = new HashSet<>();
        for (int i = 0; i < bigString.length(); i++) {
            findSmallStringsIn(bigString, i, trie, containedStrings);
        }

        List<Boolean> solution = new ArrayList<>();
        for (String str: smallStrings) {
            solution.add(containedStrings.contains(str));
        }
        return solution;
    }

    public static void findSmallStringsIn(String str, int startIdx, Trie trie, Set<String> containedStrings) {
        TrieNode1 currentNode = trie.root;
        for( int i = startIdx; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!currentNode.children.containsKey(currentChar)) {
                break;
            }
            currentNode = currentNode.children.get(currentChar);
            if(currentNode.children.containsKey(trie.endSymbol)) {
                containedStrings.add(currentNode.word);
            }
        }
    }

    static class TrieNode1 {
        Map<Character, TrieNode1> children = new HashMap<>();
        String word;
    }

    static class Trie {
        TrieNode1 root = new TrieNode1();
        char endSymbol = '*';

        public void insert(String str) {
            TrieNode1 node = root;
            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                if (!node.children.containsKey(letter)) {
                    TrieNode1 newNode = new TrieNode1();
                    node.children.put(letter, newNode);
                }
                node = node.children.get(letter);
            }
            node.children.put(endSymbol, null);
            node.word = str;
        }
    }



    public static void main(String[] args) {

       List<Boolean> result =  multiStringSearch2("this is a big string", new String[] {"this", "yo", "is", "a", "bigger", "string", "kappa"});
        System.out.println(result);
    }
}

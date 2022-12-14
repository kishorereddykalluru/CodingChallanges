package algoexpert.recursion.hard;

import java.util.ArrayList;

public class GenerateDivTags {

    //O((2n)!/(n!((n + 1)!)))) time | O((2n)!/((n!((n+1)!)))) space - where n is the input number
    public ArrayList<String> generateDivTags(int numberOfTags) {
        ArrayList<String> matchedDevTags = new ArrayList<>();
        generateDivTagsFromPrefix(numberOfTags, numberOfTags, "", matchedDevTags);
        return matchedDevTags;
    }

    public void generateDivTagsFromPrefix(int openingTagsNeeded, int closingTagsNeeded, String prefix, ArrayList<String> result) {
        if(openingTagsNeeded > 0) {
            String newPrefix = prefix + "<div>>";
            generateDivTagsFromPrefix(openingTagsNeeded - 1, closingTagsNeeded, newPrefix, result);
        }

        if(openingTagsNeeded < closingTagsNeeded) {
            String newPrefix = prefix + "</div>";
            generateDivTagsFromPrefix(openingTagsNeeded, closingTagsNeeded - 1, newPrefix, result);
        }

        if(closingTagsNeeded == 0) {
            result.add(prefix);
        }
    }

    public static void main(String[] args) {


    }
}

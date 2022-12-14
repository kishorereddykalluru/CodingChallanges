package algoexpert.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class Powerset {

    //O(n*2^n) time | O(n*2^n) space
    public static List<List<Integer>> powerset(List<Integer> array) {
        return powerset(array, array.size()-1);
    }

    public static List<List<Integer>> powerset(List<Integer> array, int idx) {
        if(idx < 0) {
            List<List<Integer>> emptySet = new ArrayList<>();
            emptySet.add(new ArrayList<>());
            return emptySet;
        }

        int ele = array.get(idx);
        List<List<Integer>> subsets = powerset(array, idx-1);
        int length = subsets.size();
        for(int i = 0; i < length; i++) {
            List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
            currentSubset.add(ele);
            subsets.add(currentSubset);
        }
        return subsets;
    }

    //O(n*2^n) time | O(n*2^n) space
    public static List<List<Integer>> powerset1(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(Integer ele: array) {
            int length = subsets.size();
            for(int i = 0; i < length; i++) {
                List<Integer> currentSubset = new ArrayList<>();
                currentSubset.add(ele);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {

    }
}

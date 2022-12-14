package algoexpert.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    //Upper Bound: O(n^2*n!) time | O(n*n!) space
    //Roughly : O(n * n!) time | O(n*n!) space
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(array, new ArrayList<>(), permutations);
        return permutations;
    }

    public static void getPermutations(List<Integer> array, List<Integer> currentPermutations, List<List<Integer>> permutations) {
        if(array.size() == 0 && currentPermutations.size() > 0) {
            permutations.add(currentPermutations);
        } else {
            for(int i = 0; i < array.size(); i++) {
                List<Integer> newArray = new ArrayList<>();
                newArray.remove(i);
                List<Integer> newPermutation = new ArrayList<>(currentPermutations);
                getPermutations(newArray, newPermutation, permutations);
            }
        }
    }

    // O(n * n!) time | O(n * n!) space
    public static List<List<Integer>> getPermutations1(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations1(0, array, permutations);
        return permutations;
    }

    private static void getPermutations1(int i, List<Integer> array, List<List<Integer>> permutations) {
        if(i == array.size() - 1){
            permutations.add(new ArrayList<>(array));
        } else {
            for(int j = i; j < array.size(); i++) {
                swap(array, i, j);
                getPermutations1(i + 1, array, permutations);
                swap(array, i , j);
            }
        }
    }

    public static void swap(List<Integer> array, int i, int j) {
        Integer temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public static void main(String[] args) {

    }
}

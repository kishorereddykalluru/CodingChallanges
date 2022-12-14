package algoexpert.recursion.veryhard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfBinaryTreeTopology {

    public static int numberOfBinaryTreeTopology(int n) {
        if(n == 0) {
            return 1;
        }

        int numberOfTrees = 0;
        for( int leftTreeSize = 0; leftTreeSize < n; leftTreeSize++) {
            int rightTreeSize = n - 1 - leftTreeSize;
            int numberOfLeftTrees = numberOfBinaryTreeTopology(leftTreeSize);
            int numberOfRightTrees = numberOfBinaryTreeTopology(rightTreeSize);
            numberOfTrees += numberOfLeftTrees * numberOfRightTrees;
        }
        return numberOfTrees;
    }


    public static int numberOfBinaryTreeTopologies1(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, 1);
        return numberOfBinaryTreeTopologies1(n, cache);
    }

    public static int numberOfBinaryTreeTopologies1(int n, Map<Integer, Integer> cache) {
        if(cache.containsKey(n)) return cache.get(n);

        int numberOfTrees = 0;
        for(int leftTreeSize = 0; leftTreeSize < n; leftTreeSize++) {
            int rightTreeSize = n - 1 - leftTreeSize;
            int numberOfLeftTrees = numberOfBinaryTreeTopologies1(leftTreeSize, cache);
            int numberOfRightTrees = numberOfBinaryTreeTopologies1(rightTreeSize, cache);
            numberOfTrees += numberOfLeftTrees * numberOfRightTrees;
        }
        return numberOfTrees;
    }

    public static int numberOfBinaryTreeTopologies2(int n) {
        List<Integer> cache = new ArrayList<>();
        cache.add(1);

        for(int m = 1; m < n + 1; m++) {
            int numberOfTrees = 0;
            for (int leftTreeSize = 0; leftTreeSize < n; leftTreeSize++) {
                int rightTreeSize = n - 1 - leftTreeSize;
                int numberOfLeftTrees = cache.get(leftTreeSize);
                int numberOfRightTrees = cache.get(rightTreeSize);
                numberOfTrees += numberOfLeftTrees * numberOfRightTrees;
            }
            cache.add(numberOfTrees);
        }
        return cache.get(n);
    }

    public static void main(String[] args) {


    }
}

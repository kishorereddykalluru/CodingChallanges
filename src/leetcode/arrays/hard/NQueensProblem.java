package leetcode.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {


    public static void helper(char[][] board, List<List<String>> result, int start) {

    }
    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, result, 0);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(solveNQueens(4));
    }
}

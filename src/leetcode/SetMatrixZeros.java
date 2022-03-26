package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

    public static int[][] rowColumnZero(int[][] input){
        int r = input.length;
        int c = input[0].length;

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(input[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(row.contains(i) || col.contains(j)){
                   input[i][j] = 0;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int [][] input = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] ints = rowColumnZero(input);
        for(int i = 0; i < ints.length; i++){
            for(int j = 0; j < ints[0].length; j++){
                System.out.print(ints[i][j]);
            }
            System.out.println();
        }
    }
}

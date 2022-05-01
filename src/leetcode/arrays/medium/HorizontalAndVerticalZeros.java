package leetcode.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class HorizontalAndVerticalZeros {

    public static int[][] convertToZeros(int[][] matrix){

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(rowSet.contains(i) || colSet.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        int [][] matrix = {
            {1,7,3,4}, {4,0,0,4},{1,6,3,4}
        };

       int result[][] = convertToZeros(matrix);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}

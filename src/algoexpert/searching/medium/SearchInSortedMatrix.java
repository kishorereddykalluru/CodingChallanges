package algoexpert.searching.medium;

public class SearchInSortedMatrix {

    public static int[] searchInSotredMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return new int[]{row, col};
            }
        }
        return new int[] {row, col};
    }

    public static void main(String[] args) {


    }
}

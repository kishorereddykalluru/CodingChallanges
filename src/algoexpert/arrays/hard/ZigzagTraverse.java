package algoexpert.arrays.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that takes in an n * m two-dimensional array(that can be square-shaped when n==m) and returns a
 * one dimensional array of all the array's elements in zigzag order
 *
 * Zigzag order starts af the top left corner of the two-dimensional array, goes down by one element, and proceeds in a zigzag
 * pattern all the way to the bottom right corner.
 */

public class ZigzagTraverse {

    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        int height = array.size() - 1;
        int width = array.get(0).size() - 1;
        List<Integer> result = new ArrayList<>();
        int row = 0;
        int col = 0;

        boolean goingDown = true;
        while (!isOutofBounds(row, col, height, width)) {
            result.add(array.get(row).get(col));
            if (goingDown) {
                if (col == 0 || row == height) {
                    goingDown = false;
                    if (row == height) {
                        col++;
                    } else {
                        row++;
                    }
                } else {
                    row++;
                    col--;
                }
            } else {
                if (row == 0 || col == width) {
                    goingDown = true;
                    if(col == width) {
                        row++;
                    } else {
                        col++;
                    }
                } else{
                    row--;
                    col++;
                }
            }
        }
        return result;
    }
   public static boolean isOutofBounds(int row, int col, int height, int width){
        return row < 0 || row > height || col < 0 || col > width;
    }

    public static void main(String[] args) {
      List<Integer> zigzag = zigzagTraverse(List.of(List.of(1,3 ,4, 10), List.of(2, 5, 9, 11), List.of(6, 8, 12, 15), List.of(7, 13, 14, 16)));
      zigzag.forEach(System.out::print);
    }
}

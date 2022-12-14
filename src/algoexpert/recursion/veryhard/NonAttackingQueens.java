package algoexpert.recursion.veryhard;

import java.util.HashSet;

public class NonAttackingQueens {

    public int nonAttackingQueens(int n) {
        int[] columnPlacements = new int[n];
        return getNumberOfNonAttackingQueenPlacements(0, columnPlacements, n);
    }

    public int getNumberOfNonAttackingQueenPlacements(int row, int[] columnPlacements, int boardSize) {
        if(row == boardSize) return 1;

        int validPlacements = 0;
        for(int col = 0; col < boardSize; col++) {
            if(isNonAttackingPlacement(row, col, columnPlacements)) {
                columnPlacements[row] = col;
                validPlacements += getNumberOfNonAttackingQueenPlacements(row + 1, columnPlacements, boardSize);
            }
        }

        return validPlacements;
    }

    // As 'row' tends to 'n', this becomes an O(n) - time operation.
    public boolean isNonAttackingPlacement(int row, int col, int[] columnPlacements) {
        for(int previousRow = 0; previousRow < row; previousRow++) {
            int columnToCheck = columnPlacements[previousRow];
            boolean sameColumn = (columnToCheck == col);
            boolean onDiagonal = Math.abs(columnToCheck - col) == (row - previousRow);
            if(sameColumn || onDiagonal) {
                return false;
            }
        }

        return true;
    }

    public int nonAttackingQueens1(int n) {
        HashSet<Integer> blockedColumns = new HashSet<>();
        HashSet<Integer> blockedUpDiagonals = new HashSet<>();
        HashSet<Integer> blockedDownDiagonals = new HashSet<>();

        return getNumberOfNonAttackingQueenPlacements1(0, blockedColumns, blockedUpDiagonals, blockedDownDiagonals, n);
    }

    public int getNumberOfNonAttackingQueenPlacements1(int row, HashSet<Integer> blockedColumns, HashSet<Integer> blockedUpDiagonals,
                                                       HashSet<Integer> blockedDownDiagonals, int boardSize) {
        if(row == boardSize) return 1;

        int validPlacements = 0;
        for(int col = 0; col < boardSize; col++) {
            if(isNonAttackingPlacement1(row, col, blockedColumns, blockedUpDiagonals, blockedDownDiagonals)) {
                placeQueen(row, col, blockedColumns, blockedUpDiagonals, blockedDownDiagonals);
                validPlacements += getNumberOfNonAttackingQueenPlacements1(row + 1, blockedColumns, blockedUpDiagonals, blockedDownDiagonals, boardSize);
                removeQueen(row, col, blockedColumns, blockedUpDiagonals, blockedDownDiagonals);
            }
        }
        return validPlacements;
    }

    public boolean isNonAttackingPlacement1(int row, int col, HashSet<Integer> blockedColumns, HashSet<Integer> blockedUpDiagonals, HashSet<Integer> blockedDownDiagonals) {
        if(blockedColumns.contains(col)) {
            return false;
        } else if(blockedUpDiagonals.contains(row + col)) {
            return false;
        } else if (blockedDownDiagonals.contains(row - col)) {
            return false;
        }

        return true;
    }

    public void placeQueen(int row, int col, HashSet<Integer> blockedColumns, HashSet<Integer> blockedUpDiagonals, HashSet<Integer> blockedDownDiagonals) {
        blockedColumns.add(col);
        blockedUpDiagonals.add(row + col);
        blockedDownDiagonals.add(row - col);
    }

    public void removeQueen(int row, int col, HashSet<Integer> blockedColumns, HashSet<Integer> blockedUpDiagonals, HashSet<Integer> blockedDownDiagonals) {
        blockedColumns.add(col);
        blockedUpDiagonals.add(row + col);
        blockedDownDiagonals.add(row - col);
    }

    public static void main(String[] args) {


    }
}

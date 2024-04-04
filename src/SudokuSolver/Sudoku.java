package SudokuSolver;

public class Sudoku {
    public static void solveSudoku(int[][] bord) {
        solveSudoku(bord, 0 , 0);
    }
    public static void solveSudoku(int[][] board, int row, int col) {
        // Exit condition
        if (row == board.length) {
            printBoard(board);
        }
        else {
            int nextCol = (col + 1) % board.length;
            int nextRow = (col == board.length - 1) ? row + 1 : row;
            // The cell is taken
            if (board[row][col] != 0) {
                solveSudoku(board, nextRow, nextCol);
            }
            // The cell is free
            else {
                for (int i = 1; i <= 9; i++) {
                    if (isValidSudoku(board, row, col, i)) {
                        board[row][col] = i;
                        solveSudoku(board, nextRow, nextCol);
                        board[row][col] = 0;
                    }
                }
            }
        }
    }

    public static boolean isValidSudoku(int[][] bord, int row, int col, int value) {
        // Row
        for (int i = 0; i < bord.length; i++) {
            if ((i != col) && bord[row][i] == value)
                return false;
        }

        // Column
        for (int i = 0; i < bord[0].length; i++) {
            if ((i != row) && bord[i][col] == value)
                return false;
        }

        // Subgrid
        int parentRow = row - (row % 3);
        int parentCol = col - (col % 3);
        for (int i = parentRow; i < parentRow + 3; i++) {
            for (int j = parentCol; j < parentCol + 3; j++) {
                if ((i != row && j != col) && bord[i][j] == value)
                    return false;
            }
        }
        return true;
    }
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        //int[][] board = new int[9][9];
//        for (int[] a: board) {
//            a = new int[9]
//        }
        //printBoard(board);
        solveSudoku(board);

    }
}

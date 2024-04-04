package SudokuSolver;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static SudokuSolver.Sudoku.*;
import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {
    final int[][] board = {
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

    @Test
    void isValidTest() {
        assertFalse(isValidSudoku(board, 6, 3, 9));
    }

    @Test
    void solveSudokuPrints(){
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(byteArrayOutputStream));

        solveSudoku(board);



    }

}
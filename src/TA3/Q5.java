package TA3;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {4, 5}, {7, 8}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }

    public static int[][] transpose(int[][] array) {
        int[][] arrTranspose = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrTranspose[j][i] = array[i][j];
            }
        }
        return arrTranspose;
    }
}

package TA3;

public class Q4 {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] Shalom : array) {
            for (int element : Shalom) {
                sum += element;
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }
        return sum;
    }
}

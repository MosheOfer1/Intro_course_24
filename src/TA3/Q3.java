package TA3;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }
    public static void reverse(int [] arr) {
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(i == 0 ? arr[i] : arr[i]+",");
        }
        System.out.print("]");

    }
}

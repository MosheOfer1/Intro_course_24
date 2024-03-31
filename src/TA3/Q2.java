package TA3;

public class Q2 {
    public static void main(String[] args) {
        // Use example
        int[] arr = {1, 2, 3, 4, 5};
        arrayMean(arr); // Output: 15
    }
    public static void arrayMean(int[] arr){
        int avarage = 0;
        for (int element : arr) {
            avarage += element;
        }
        avarage /= arr.length;
        System.out.println(avarage);
    }
}

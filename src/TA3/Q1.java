package TA3;

public class Q1 {
    public static void main(String[] args) {
        // Use example
        int[] arr = {1, 2, 3, 4, 5};
        arraySum(arr); // Output: 15
    }
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }
}

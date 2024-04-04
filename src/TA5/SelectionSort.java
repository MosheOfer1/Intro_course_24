package TA5;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = findMinIndex(arr, i);
            swap(arr, i, minIndex);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int findMinIndex(int[] arr, int start) {
        int minIndex = start;
        for (int j = start + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

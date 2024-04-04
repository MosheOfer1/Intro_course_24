package TA5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == target) {
                // Found the target
                return mid;
            } else if (array[mid] < target) {
                // The target is probably on the right side
                low = mid + 1;
            } else {    // array[mid] > target
                // The target is probably on the left side
                high = mid - 1;
            }
        }
        // The target not in the array
        throw new RuntimeException("Not such target in the array");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int[] arr = {1, 2, 65, 34, 84, 345, 2, 97, 43, 3, 76, 9};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, target));
    }
}

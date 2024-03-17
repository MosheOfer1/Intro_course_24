package TA2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            i++;
            if (i > x) {
                break;
            }
        }
        System.out.println(sum);
    }
}

package TA1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("a mod (b) = " + a % b);
    }
}

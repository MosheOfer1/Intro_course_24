package TA1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        a = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        b = scanner.nextDouble();

        double average = (a + b) / 2;
        System.out.println(average);
    }
}

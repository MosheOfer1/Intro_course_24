package TA1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

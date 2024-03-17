package TA1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();


        // Checks for valid input
        if (num < 1000 || num > 9999) {
            System.out.println("Invalid number");
        } else {
            System.out.println(num / 1000);
            System.out.println((num / 100) % 10);
            System.out.println((num / 10) % 10);
            System.out.println(num % 10);
        }
    }
}

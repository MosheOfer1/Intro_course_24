package TA7;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Insert two numbers for Fraction");
        while (true) {
            int nominator = num.nextInt();
            int denominator = num.nextInt();
            int check = 0;
            try {
                check = nominator / denominator;
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.err.println("Exception: denominator is zero");
            }
            System.out.println(nominator+ " / "+ denominator + " = " + check);
        }
    }

    public static int fun(int a, int b) throws Exception{
        return a/b;
    }
}


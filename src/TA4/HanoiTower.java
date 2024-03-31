package TA4;

public class HanoiTower {
    public static void main(String[] args) {
        hanoi(5,1,2,3);
    }
    public static int asciiValue = 65;
    public static void hanoi(int discs, int src, int dest, int helper) {
        if (discs == 1) {
            System.out.println("Move disc "+ (char) asciiValue +" from "+ src + " to " + dest);
            return;
        }
        hanoi(discs - 1, src, helper, dest);
        System.out.println("Move disc "+ (char) (asciiValue + (discs - 1)) +" from "+ src + " to " + dest);
        hanoi(discs - 1, helper, dest, src);
    }
}

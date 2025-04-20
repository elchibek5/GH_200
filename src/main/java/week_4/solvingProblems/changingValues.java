package week_4.solvingProblems;

import java.util.Scanner;

public class changingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        c = b;
        b = a;
        a = c;
        System.out.println(a + " " + b);
    }
}

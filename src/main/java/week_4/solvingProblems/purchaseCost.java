package week_4.solvingProblems;

import java.util.Scanner;

public class purchaseCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int dollars = a * c;
        int cents = b * c;

        dollars += cents / 100;
        cents = cents % 100;

        System.out.println(dollars + " " + cents);
    }
}

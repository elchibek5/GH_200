package week_5.solving_problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int total = 1;
        for (int i = x; i > 0; i--) {
            total *= i;
        }
        System.out.println(total);
    }
}

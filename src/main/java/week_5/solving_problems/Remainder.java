package week_5.solving_problems;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i +" ");
            }
        }
    }
}

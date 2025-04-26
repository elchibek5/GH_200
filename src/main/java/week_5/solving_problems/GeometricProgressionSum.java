package week_5.solving_problems;

import java.util.Scanner;

public class GeometricProgressionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        int n = sc.nextInt();

        double sum = 1;
        double term = 1;

        for (int i = 1; i <= n; i++) {
            term *= a;
            sum += term;
        }
        System.out.println(sum);
    }
}

package week_5.solving_problems;

import java.util.Scanner;

public class SumOfPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 1;
        int current = 1;

        for (int i = 1; i <= N; i++) {
            current *= 2;
            sum += current;
        }
        System.out.println(sum);
    }
}

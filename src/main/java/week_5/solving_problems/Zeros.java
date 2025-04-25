package week_5.solving_problems;

import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int zeros = sc.nextInt();
            if (zeros == 0) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}

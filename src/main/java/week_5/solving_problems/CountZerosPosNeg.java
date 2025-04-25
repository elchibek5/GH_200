package week_5.solving_problems;

import java.util.Scanner;

public class CountZerosPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int zeros = 0;
        int positives = 0;
        int negatives = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            if (input == 0) {
                zeros += 1;
            } else if (input > 0) {
                positives += 1;
            } else{
                negatives += 1;
            }
        }
        System.out.println(zeros + " " + positives + " " + negatives);
    }
}

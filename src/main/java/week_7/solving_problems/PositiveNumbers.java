package week_7.solving_problems;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[sc.nextInt()];
        int positive_nums = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            if (number >= 1) {
                positive_nums++;
            }
        }
        System.out.println(positive_nums);
    }
}

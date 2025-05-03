package week_7.solving_problems;

import java.util.Scanner;

public class GreaterThenPreviousNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[sc.nextInt()];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) count++;
        }
        System.out.println(count);
    }
}

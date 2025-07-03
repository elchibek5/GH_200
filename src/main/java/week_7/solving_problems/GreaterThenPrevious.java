package week_7.solving_problems;

import java.util.Scanner;

public class GreaterThenPrevious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[sc.nextInt()];

        int count  = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) count++;

        }
//  Printing out the final answer
        System.out.println(count);
    }
}

package week_5.solving_problems;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt(), b = sc.nextInt();

        int start = (int) Math.ceil(Math.sqrt(a));
        int end = (int) Math.floor(Math.sqrt(b));

        for (int i = start; i <= end; i++) {
            System.out.println(i * i);
        }
    }
}

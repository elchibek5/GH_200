package recursion_problems;

import java.util.Scanner;

public class towersOfHanoi {
    private void move(int n, int from, int to, int helper) {
        if (n == 1) {
            System.out.println(1 + " " + from + " " + to);
            return;
        }
        move(n - 1, from, helper, to);
        System.out.println(n + " " + from + " " + to);
        move(n - 1, helper, to, from);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi tw = new towersOfHanoi();
        tw.move(n, 1, 3, 2);
    }
}
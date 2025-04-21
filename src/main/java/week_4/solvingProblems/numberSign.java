package week_4.solvingProblems;

import java.util.Scanner;

public class numberSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= 1) {
            System.out.println(1);
        } else if (input == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}

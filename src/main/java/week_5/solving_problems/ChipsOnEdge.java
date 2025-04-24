//package week_5.solving_problems;

import java.util.Scanner;

public class ChipsOnEdge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        if ((k + 4) % 4 == 0) {
            int n = (k + 4) / 4;
            if (n >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}

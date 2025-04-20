package week_4.solvingProblems;

import java.util.Scanner;

public class courseFinish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int total = 0;
        int startMinutes = 9 * 60;

        for (int i = 1; i <= a; i++) {
            total += 45;

            if (i < a) {
                if (i % 2 == 0) {
                    total += 15;
                } else {
                    total += 5;
                }
            }

        }
        int totalMinutes = startMinutes + total;

        int h = totalMinutes / 60;
        int m = totalMinutes % 60;

        System.out.printf("%02d %02d", h, m);

        sc.close();

    }
}

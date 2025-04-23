package week_5.solving_problems;

import java.util.Scanner;

public class chessHorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int guess1 = sc.nextInt();
        int guess2 = sc.nextInt();
        int[][] moves = {
                {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
                {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };

        boolean canMove = false;

        for (int[] move: moves) {
            int newX = a + move[0];
            int newY = b + move[1];

            if (newX == guess1 && newY == guess2) {
                canMove = true;
                break;
            }
        }

        if (canMove) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

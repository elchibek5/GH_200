package week_13;

import java.util.Scanner;

public class canReachN {
    static int n;

    static boolean rec(int x) {
        if (x > n) {
            return false;
        } else if (x == n) {
            return true;
        }

        if (rec(x + 5)) {
            return true;
        }
        if (rec(x + 3)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (rec(1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

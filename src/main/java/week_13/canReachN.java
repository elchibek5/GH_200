package week_13;

import java.util.Scanner;

public class canReachN {
    static int n;
    static int[] visited;

    static boolean rec(int x) {
        if (x > n) {
            return false;
        } else if (x == n) {
            return true;
        }

        if (visited[x] != -1) {
            return (visited[x] == 1);
        }

        if (rec(x + 5)) {
            visited[x] = 1;
        } else if (rec(x + 3)) {
            visited[x] = 1;
        }

        if (visited[x] == -1) {
            visited[x] = 0;
        }
        return (visited[x] == 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        visited = new int[n];
        for (int i = 0; i < n; i++) {
            visited[i] = -1;
        }

        if (rec(1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


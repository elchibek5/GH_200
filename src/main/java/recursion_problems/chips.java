package recursion_problems;

import java.io.PrintWriter;
import java.util.Scanner;

public class chips {
    private PrintWriter out;

    private void put(int n) {
        if (n == 1) {
            out.print("1 ");
            return;
        }
        put(n - 1);
        out.print(n + " ");
        remove(n - 1);
    }

    private void remove(int n) {
        if (n == 1) {
            out.print("-1 ");
            return;
        }
        put(n - 1);
        out.print("-" + n + " ");
        remove(n - 1);
    }

    private void run(Scanner in, PrintWriter out) {
        this.out = out;
        int n = in.nextInt();
        put(n);
        out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new chips().run(in, out);
        out.flush();
    }
}

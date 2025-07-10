package week_13;

import java.util.Scanner;

public class GCD {
    private static int gcd(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        while (b != 0) {
            a %= b;
            int t = a;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sqrt = (int) Math.floor(Math.sqrt(n));
        boolean first_print = true;
        for (int i = 2; i <= sqrt; i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                if (first_print) {
                    first_print = false;
                } else {
                    System.out.println("*");
                }
                System.out.println(i);
                if (count > 1) {
                    System.out.println("^" + count);
                }
            }
        }
        if (n > 1) {
            if (first_print) {
                first_print = false;
            } else {
                System.out.println("*");
            }
            System.out.println(n);
        }
    }
}

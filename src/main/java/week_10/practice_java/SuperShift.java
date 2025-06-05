package week_10.practice_java;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SuperShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BufferedInputStream br = new BufferedInputStream(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }
        int k = sc.nextInt();

        k %= n; // k = k % n;
        if (k < 0) {
            k += n;
        }
        System.out.println(k);

        ArrayList<Integer> b = new ArrayList<> ();

        for (int i = n - 1; i < n; i++) {
            b.add(a.get(i));
        }

        for (int i = 0; i < n - k; i++) {
            b.add(a.get(i));
        }

        a = b;

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a.get(i));
        }
    }
}

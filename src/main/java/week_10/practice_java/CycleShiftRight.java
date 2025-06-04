package week_10.practice_java;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleShiftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }

        ArrayList<Integer> b = new ArrayList<>();
        b.add(a.get(a.size() - 1));
        for (int i = 0; i < n - 1; i++) {
            b.add(a.get(i));
        }
        a = b;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a.get(i));
        }

    }
}

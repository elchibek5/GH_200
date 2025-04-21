package week_3.homeworks;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (i % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

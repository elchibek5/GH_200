package week_9.informatics;

import java.util.Scanner;

public class SwapNums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length - 1; i+=2) {
            int current = a[i];
            a[i] = a[i + 1];
            a[i + 1] = current;
        }

        for (int j : a) {
            System.out.println(j + " ");
        }
    }
}

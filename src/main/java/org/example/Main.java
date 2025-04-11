package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int number = sc.nextInt();
        boolean meet = false;

        for (int i = 0; i < n; i++) {
            if (number == array[i]) {
                meet = true;
            }
        }
        if (meet == true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
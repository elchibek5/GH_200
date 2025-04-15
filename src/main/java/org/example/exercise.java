package org.example;

import java.util.Scanner;

public class exercise {
    public static int processString(String input) {
        int length = input.length();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        return length;
    }
        public static void main(String[] args) {
            System.out.println("Hello, world!");
    }

}

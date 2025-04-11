package org.example;

import java.util.Random;
import java.util.Scanner;

public class week_2_exercise {
    public static void main(String[] args) {

        Random random = new Random();
        int number = Math.abs(random.nextInt()) % 100;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number.");

        int guess = sc.nextInt();
        do {
           if (guess > number) {
               System.out.println("Too high");
           } else {
                   System.out.println("Too low");
           }
           guess = sc.nextInt();
        } while (guess != number);
        System.out.println("You won!");
    }
}

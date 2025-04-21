package week_3.homeworks;

import java.util.Scanner;

public class Pythagorean_formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);
    }
}

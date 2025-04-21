package week_3.homeworks;

import java.util.Scanner;

public class Electric_Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = (n / 60) % 24;
        int m = (n % 60);

        System.out.println(h + " " + m);
    }
}

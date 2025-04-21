package week_3.homeworks;

import java.util.Scanner;

public class ElectricWatch2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int h = (n / 3600) % 24;
            int m = (n / 60) % 60;
            int s = n % 60;

            System.out.printf("%d:%02d:%02d\n", h, m, s);

            sc.close();
    }
}

package homeworks;

import java.util.Scanner;

public class ElectricWatch2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int h = ((n / 60) / 60) % 24;
            int m = (n / 60) % 60;
            int s = n % 60;

            System.out.println(h + ":" + m + ":" + s);

            sc.close();
    }
}

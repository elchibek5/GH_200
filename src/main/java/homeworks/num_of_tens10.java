package homeworks;

import java.util.Scanner;

public class num_of_tens10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println((a / 10) % 10);
        }
}

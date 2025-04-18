package homeworks;

import java.util.Scanner;

public class next_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        System.out.println(a + 2 - (a % 2));
    }
}

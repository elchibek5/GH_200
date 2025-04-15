package homeworks;

import java.util.Scanner;

public class next_and_previous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int previous_n = a - 1;
        int next_n = a + 1;
        System.out.println("The next number for the number " + a + " is " + next_n + ".");
        System.out.println("The previous number for the number " + a + " is " + previous_n + ".");

    }
}

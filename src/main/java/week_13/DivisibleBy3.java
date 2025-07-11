package week_13;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int sum = 0;
        for (int i  = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            sum += digit;
        }
        System.out.println(sum % 3 == 0 ? "YES" : "NO");
    }
}

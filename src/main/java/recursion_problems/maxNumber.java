package recursion_problems;

import java.util.Scanner;

public class maxNumber {
        private int findMax(String s) {
            if (s.length() == 1) {
                char ch = s.charAt(0);
                return ch - '0';
            } else {
                char ch = s.charAt(0);
                int digit = ch - '0';
                int maxRest = findMax(s.substring(1));
                return Math.max(digit, maxRest);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            sc.close();

            maxNumber mn = new maxNumber();
            int maxDigit = mn.findMax(input);

            System.out.println(maxDigit);
        }
}

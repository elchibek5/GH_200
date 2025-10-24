package recursion_problems;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class palindrome {
    public boolean isPalindrome(String input) {
        if (input.length() <= 1) return true;

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        palindrome pl = new palindrome();
        boolean check = pl.isPalindrome(input);
        System.out.println(check);
    }
}

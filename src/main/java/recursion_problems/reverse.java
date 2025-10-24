package recursion_problems;

import java.util.Scanner;

public class reverse {
    public String reverseString(String input) {
        if (input.isEmpty()) {
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        reverse rv = new reverse();
        String reversed = rv.reverseString(input);
        System.out.println(reversed);
    }
}

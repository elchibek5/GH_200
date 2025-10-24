package recursion_problems;

import java.util.Scanner;

public class decimalToBinary {
    public String convert(int num, String result) {
        if (num == 0) {
            return result;
        }

        result = num % 2 + result;
        return convert(num / 2, result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        decimalToBinary dc = new decimalToBinary();
        String input = dc.convert(num, "");

        System.out.println(input);
    }
}

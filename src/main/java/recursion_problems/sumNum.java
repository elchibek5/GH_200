package recursion_problems;

import java.util.Scanner;

public class sumNum {
    public int allSum(int num) {
        if (num <= 1) {
            return num;
        }
        return num + allSum(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        sumNum sm = new sumNum();
        int check = sm.allSum(input);
        System.out.println(check);

    }
}

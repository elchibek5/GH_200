package week_4.solvingProblems;

import java.util.Scanner;

public class symmetricNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expected = sc.nextInt();
        int student = sc.nextInt();

        if ((expected == 1 && student == 1) || (expected != 1 && student != 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }


}

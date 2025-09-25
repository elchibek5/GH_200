package informatics_practice;

import java.util.Scanner;

public class continue_reverse {
    static String s;
    static  int n;

    static void rec(int ind) {
        if (ind >= n) {
            return ;
        }
        rec(ind + 1);
        if (s.charAt(ind) == '(') {
            s += ')';
        } else {
            s += s.charAt(ind);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        n = s.length();
        rec(0);
        System.out.println(s);
    }
}

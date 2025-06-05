package week_10.zuma;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> balls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            balls.add(x);
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.add(balls.get(i));
            if (stack.size() < 3) {
                continue;
            }

            int a = stack.pop();
            int b = stack.pop();
            int c = stack.pop();
            if (a != b || a != c || b != c) {
                stack.add(c);
                stack.add(b);
                stack.add(a);
                continue;
            }

            while (i < n) {
                if (balls.get(i) != a) {
                    break;
                }
                i++;
            }
            i--;
        }
//        for (int s : stack) {
//            System.out.printf("%d ", s);
//        }
//        System.out.println();
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
        System.out.println(n - stack.size());
    }
}

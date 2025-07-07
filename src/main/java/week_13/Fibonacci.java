package week_13;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}

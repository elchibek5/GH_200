package week_3.recursion; //Function which calls itself.

public class Factorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

}

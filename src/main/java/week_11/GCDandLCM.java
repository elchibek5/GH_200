package week_11;

public class GCDandLCM {

    //Second Option to get Greatest Common Devisor
    private static int gcdAnotherOption(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b  = t;
        }

        while (b != 0 ) {
            a %= b;
            int t = a;
            a = b;
            b = t;
        }
        return a;
    }


    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcd(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int eulerTotient(int n) {
        int result = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) n /= i;
                result -= result - i;
            }
        }
        if (n > 1) result -= result / n;
        return result;
    }
}

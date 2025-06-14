package week_11.exercises;

public class PrimeCheck {
    // It's not an algorithm, so it takes a lot of memory
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

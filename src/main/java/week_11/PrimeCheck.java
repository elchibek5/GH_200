package week_11;

import java.util.Arrays;

public class PrimeCheck {
    // It's not an algorithm, so it takes a lot of memory
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // This code takes the was less memory than the first one.
    void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;

        for(int p = 2; p * p <= n; n++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) System.out.println(i);
        }
    }
}

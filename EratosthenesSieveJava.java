package sieve;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesSieveJava {
    private final int max;

    public EratosthenesSieveJava(int max) {
        this.max = max;
    }

    public List<Integer> getPrimes() {
        // Boolean array to track whether a number is prime or not
        boolean[] isPrime = new boolean[this.max + 1];
        for (int i = 0; i <= this.max; i++) {
            isPrime[i] = true;
        }

        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        // Iterate through numbers starting from 2 up to max/2
        for (int i = 2; i <= this.max / 2; i++) {
            // If the current number is prime
            if (isPrime[i]) {
                // Mark all multiples of the current prime as not prime
                for (int j = 2 * i; j <= this.max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Filter out the indices of true values (prime numbers)
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
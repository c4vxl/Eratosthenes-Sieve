class EratosthenesSieve(val max: Int) {
    val primes: MutableList<Int>
        get() {
            // Boolean array to track whether a number is prime or not
            val isPrime = BooleanArray(this.max + 1) { true }

            // 0 and 1 are not prime numbers
            isPrime[0] = false
            isPrime[1] = false

            // Iterate through numbers starting from 2 up to max/2
            for (i in 2..(this.max / 2)) {
                // If the current number is prime
                if (isPrime[i]) {
                    // Mark all multiples of the current prime as not prime
                    for (j in 2 * i..this.max step i) {
                        isPrime[j] = false
                    }
                }
            }

            // Filter out the indices of true values (prime numbers)
            return isPrime.indices.filter { isPrime[it] }.toMutableList()
        }
}

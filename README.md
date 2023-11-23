# Eratosthenes Sieve

A program to find all prime numbers from 1 to a given limit using the Sieve of Eratosthenes algorithm.

## Introduction

The Sieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit. This program provides an implementation of the algorithm, making it easy to find prime numbers within a specified range.

## Usage

To use this program, create an instance of the `EratosthenesSieve` class, passing the desired upper limit (`max`) as a parameter. Afterward, access the `getPrimes` function to retrieve a list of prime numbers within the specified range.

## Example

Kotlin:
```kotlin
val sieve = EratosthenesSieve(100)
val primeNumbers = sieve.primes
println("Prime numbers from 1 to 100: $primeNumbers")
```

Java:
```java
val sieve = new EratosthenesSieveJava(100);
val primeNumbers = sieve.getPrimes();
println("Prime numbers from 1 to 100: " + primeNumbers);
```

Output: `Prime numbers from 1 to 100: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]`



## License

This project is licensed under the [MIT License](LICENSE).

---

## Developer
This Project was Developed by [c4vxl](https://c4vxl.de)

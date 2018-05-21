package com.gc;

public class Primes {

	public int locatePrimesAt(int i) {

		// if (i < 3) {
		// return i + 1;
		// } else if (i < 4) {
		// return i + 2;

		// } else if (i < 5) {

		// return i + 3;
		// } else if (i < 6) {
		// return i + 6;
		// }

		// return i + 7;
		if (i == 2) {
			return 2;
		}
		int prime = 3;
		for (int num = 2; num < i; i++) {
			while (!isPrime(prime)) {
				prime++;
			}
		}
		return prime;
	}

	public boolean isPrime(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}

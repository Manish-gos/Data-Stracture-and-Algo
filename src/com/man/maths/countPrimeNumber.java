package com.man.maths;

public class countPrimeNumber {
	public static boolean isPrime(int n) {
		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (n % j == 0)
				return false;

		}
		return true;
	}

	public static void main(String[] args) {
		int n = 
				1500000;
		int total = 2;
		if (n < 2)
			total = 0;

		int num1 = 2;
		int num2 = 2;
		int i = 1;
		while (n > num1 && n > num2) {
			num1 = 6 * i - 1;
			num2 = 6 * i + 1;
			if (num1 < n && isPrime(num1))
				total++;

			if (num2 < n && isPrime(num2))
				total++;
			i++;
		}
		System.out.println(total);
	}

}

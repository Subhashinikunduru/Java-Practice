package com.javaintro;

import java.util.Scanner;

public class SmithNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = sc.nextInt();
//
//		if (isSmithNumber(n)) {
//			System.out.println("is a smith number");
//		} else {
//			System.out.println("is not a smith number");
//		}
		if (isSmithNumber(22)) {
			System.out.println("yes its is a smith number");
		} else {
			System.out.println("it is not a smith number !!!");
		}
		System.out.println(digits(121));
		System.out.println(factors(121));
	}

	private static boolean isSmithNumber(int n) {
		return digits(n) == factors(n);
	}

	private static int sumOfPrimeFactors(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				sum = digits(i);
				n /= i;
			}
		}
		int num = 0;
		if (num > 1) {
			sum += digits(n);
		}

		return sum;
	}

	private static int digits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

	public static int factors(int num) {
		int sum = 0;
		while (num > 1) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
//					System.out.println(i);
					if (i > 9) {
						sum += digits(i);
					} else {
						sum += i;
					}
					num /= i;
//					System.out.println("num is : "+num);
					break;
				}
			}
		}
		return sum;
	}

}

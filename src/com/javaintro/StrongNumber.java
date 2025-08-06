package com.javaintro;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		if (isStrongNumber(n)) {
			System.out.println(n + " is a Strong Number");

		} else {
			System.out.println(n + " is not a Strong Number");

		}

	}

	private static boolean isStrongNumber(int n) {
		int sum = 0;
		int temp = n;

		while (temp > 0) {
			int digit = temp % 10;
			sum += factorial(digit);
			temp /= 10;

		}

		return sum == n;
	}

	private static int factorial(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}

		return res;
	}

}

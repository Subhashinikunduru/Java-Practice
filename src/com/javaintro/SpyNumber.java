package com.javaintro;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();

		if (isSpyNumber(n)) {
			System.out.println(n + " is a Spy number ");
		} else {
			System.out.println(n + " is not a Spy number ");
		}
	}

	private static boolean isSpyNumber(int n) {
		int sum = 0;
		int product = 1;
		int temp = n;

		while (temp > 0) {
			int digit = temp % 10;
			sum += digit;
			product*=digit;
			temp /= 10;
		}

		return sum == product;
	}

}

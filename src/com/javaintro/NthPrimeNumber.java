package com.javaintro;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int count = 0;
		int num = 0;

		while (true) {
			if (isPrime(num)) {
				count++;
				if (count == n) {
					System.out.println("The  " + n + " isPrime  " + num);
					break;
				}
			}
			num++;
		}

	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

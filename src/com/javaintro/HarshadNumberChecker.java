package com.javaintro;

import java.util.Scanner;

public class HarshadNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		if (isHarshadNumber(num)) {
			System.out.println(num + " is Harshad number");
		} else {
			System.out.println(num + " is not a Harshad number");
		}

	}

	private static boolean isHarshadNumber(int num) {
		int sum = 0;
		int accualNumber = num;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}

		return accualNumber % sum == 0;
	}

}

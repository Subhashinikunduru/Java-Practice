package com.javaintro;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		System.out.println("Enter b number:");
		int num1 = sc.nextInt();
		int count = 0;
		for (int i = num; i <= num1; i++) {
			if (isPerfect(i)) {
				 System.out.print(i + " ");
				count++;

				if (count == 2) {
					System.out.println();
					System.out.println("second perfect number in given range:" + i);
					break;
				}
			}

		}
	}

	static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			return true;
		}
		return false;
	}
}

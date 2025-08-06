package com.javaintro;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int count = 0;
		int evenCount = 0;
		int oddSum = 0;

		for (int i = n; i > 0; i = i / 10) {
			int digit = i % 10;
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddSum += digit;
			}
		}
		System.out.println("Even digitsCount:" + evenCount);
		System.out.println("Odd digits Count:" + oddSum);
	}

}

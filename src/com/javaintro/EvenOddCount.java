package com.javaintro;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("evencount:" + evenCount);
		System.out.println("oddcount:" + oddCount);
	}

}

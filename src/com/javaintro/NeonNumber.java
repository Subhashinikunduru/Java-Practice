package com.javaintro;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		if (isNeonNumber(n)) {
			System.out.println(n + " is a Neon number");
		} else {
			System.out.println(n + " is not a Neon number");
		}
		sc.close();
	}

	private static boolean isNeonNumber(int n) {
		int square=n*n;
		int sum=0;
		while(square>0) {
			sum+=square%10;
			square/=10;
		}
		
		return sum==n;
	}
}

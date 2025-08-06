package com.javaintro;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n=s.nextInt();
		int i;

		for (i =0; i <= n; i=i+2) {
			System.out.print(i + " ");
		}

	}

}

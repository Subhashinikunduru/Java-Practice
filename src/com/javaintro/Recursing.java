package com.javaintro;

import java.util.Scanner;

public class Recursing {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Recursing r=new Recursing();
//		int i = sc.nextInt();
		print(1);

	}

	static void print(int i) {
		if (i <= 10) {
			System.out.print(i+" ");
			i++;
			print(i);

		}
	}
}

package com.javaintro;

import java.util.Scanner;

public class Testdemo1{
	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Testdemo1 t = new Testdemo1();
		System.out.println("enter two  values");
		int i = sc.nextInt(); 
		int i1 = sc.nextInt();
		int c = add(i1, i);
		System.out.println(c);
		System.out.println("enter one value");
		int k=sc.nextInt();
		int k1=sub(c, k);
		System.out.println(k1);
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		int res = mul(k1,num2 );
		System.out.println("multiplication of two number : "+res);
           System.out.println("enter the second number to div");
           int num3 = sc.nextInt();
           int divres = div(mul(k1,num2 ),num3);
           System.out.println("div of two number : "+divres);
	}

}

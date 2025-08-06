package com.javaintro;
import java.util.Scanner;
public class Bitwiseoperator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first integer");
		int a=sc.nextInt();
		System.out.println("Enter the second integer");
		int b=sc.nextInt();
		System.out.println("Before swap the integers:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swap the integres");
		System.out.println("a="+a);
		System.out.println("b="+b);	
		
	}

}

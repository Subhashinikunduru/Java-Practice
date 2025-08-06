package com.javaintro;

import java.util.Scanner;

//WAP
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a n value:");
		int n=sc.nextInt();
		boolean b=isEven(n);	
		if(b) {
			System.out.println("The number is odd");
		}else {
			System.out.println("The number is even");
		}
	}
	 static boolean isEven( int n){ 
		// boolean status=false;
		 if(n%2!=0) 
			 return true;
		 else
			 return false;
			 
             		 
		 
		 
		
	}
}

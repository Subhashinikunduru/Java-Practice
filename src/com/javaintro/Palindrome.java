package com.javaintro;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println("its a palindrome");		
		}else {
			System.out.println("it is not a palindrome");
		}

	}

	private static boolean isPalindrome(int num) {
		int sum=0;
		int temp=num;
		while(num>0) {
			sum=sum*10+num%10;
			num/=10;
			
		}
		return sum==temp;
	}

}

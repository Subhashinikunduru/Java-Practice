package com.javaintro;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		if (isArmStrong(num)) {
			System.out.println(num + "is an ArmStrong Number");

		} else {
			System.out.println(num + "is not ArmStrong Number");
		}
	}

	private static boolean isArmStrong(int num) {
		
		String n=num+"";
		int tem=num;
		int count=n.length();
		int sum=0;
		while(num>0) {					
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=count;i++) {
				fact*=rem;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println("sum value is : "+sum);
		System.out.println("num value is : "+num);
		
		return tem==sum;

	}
}

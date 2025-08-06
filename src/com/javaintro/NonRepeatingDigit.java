package com.javaintro;
import java.util.Scanner;
public class NonRepeatingDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		if(isNonRepeatingDigit(n)!=0) {
			System.out.println("Non rep : "+isNonRepeatingDigit(n));
		}else {
			System.out.println("no");
		}
			
		
          sc.close();
	}

	private static int isNonRepeatingDigit(int n) {
	
		int n1=n;
		
		while(n1>0) {
			int digit1=n1%10;
			int temp=n;
			int count=0;
			while(temp>0) {
				int digit2=temp%10;
				
				if(digit1==digit2) {
					count++;
				}
				
				temp/=10;
			}
			
			if(count==1) {
				return digit1;
			}
			
			
			n1/=10;
			
			
		}
		
		return 0;
		
	}

}

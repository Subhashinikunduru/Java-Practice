package Inheritence1;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isHappyNumber(n)) {
			System.out.println("is Happy Number");
		} else {
			System.out.println("is not a happy number");
		}

	}

	private static boolean isHappyNumber(int n) {
		while(n>9) {
		  n = SumOfSquareDigits(n);
		  if(n==1) {
			  return true;
		  }
		}
		return false;
	}

	private static int  SumOfSquareDigits(int num) {
    System.out.println(num+ " this is number i am gtting ");
	int sum=0;
	while(num>0) {
		int digit=num%10;
		sum=sum+digit*digit;
		num/=10;
	}
		return sum;
	}
}

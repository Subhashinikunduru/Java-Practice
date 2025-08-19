package com.javaintro;

public class Snippet {

	public static void main(String[] args) {
		System.out.println("Print 1 to 200 numbers whose sum of divisible by 7");
		int i=0;
		for (int i1 = 1; i1 < 200; i1++) {
			
		if (isDigitSumDivisibleBy7(i1)) {
		
			System.out.print(i1+ " ");

		}
	}
	}

	static boolean isDigitSumDivisibleBy7(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
			if(num<=0 && sum>9) {
				num=sum;
				sum=0;
			}
		}
		return sum==7;

	}

}

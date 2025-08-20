package Inheritence1;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isDuckNumber(n)) {
			System.out.println("is a Duck Number");
		} else {
			System.out.println("is not a Duck Number");
		}
		int count = 0;
		int num = 1;
		while (count < 50) {
			if(isDuckNumber(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	
	}

	private static boolean isDuckNumber(int num) {
		String numstr = String.valueOf(num);
		return !numstr.startsWith("0") && numstr.contains("0");
	}
}

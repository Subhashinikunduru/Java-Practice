package Inheritence1;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isDisariumNumber(n)) {
			System.out.println("is a disarium number" + n);
		} else {
			System.out.println("is not a disarium number" + n);
		}
	}

	private static boolean isDisariumNumber(int n) {
		int temp = n;
		int sum = 0;
		int position = Integer.toString(n).length();
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, position--);
			temp /= 10;

		}
		return sum == n;
	}

}

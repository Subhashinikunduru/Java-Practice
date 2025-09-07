package PracticeJavaPrograms;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array:");
		for (int n : arr) {
			System.out.print(n + " ");
		}

		System.out.println("\nReversed Array:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}

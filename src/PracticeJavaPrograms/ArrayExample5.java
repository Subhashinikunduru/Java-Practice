package PracticeJavaPrograms;

public class ArrayExample5 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("Copied Array:");
		for (int n : arr2) {
			System.out.print(n + " ");
		}
	}
}

package PracticeJavaPrograms;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 2, 67, 34 };

		int max = arr[0];
		int min = arr[0];

		for (int num : arr) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}

		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}

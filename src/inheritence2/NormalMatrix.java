package inheritence2;

public class NormalMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 } };
		int[][] arr1 = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; i < arr[i].length; j++) {
				arr1[j][i] = arr[i][j];

			}

		}
		for (int[] a : arr1) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("******************************");
		for (int[] a : arr) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}

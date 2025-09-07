package PracticeJavaPrograms;

		public class SecondHighestInArray {
		    public static void main(String[] args) {
		        int[] arr = {10, 50, 20, 70, 40};

		        // Initialize first and second highest
		        int first = arr[0];//10,50,70,
		        int second = arr[0];//10,10,20,50

		        for (int num : arr) {
		            if (num > first) {
		                // Update both first and second
		                second = first;
		                first = num;
		            } else if (num > second && num != first) {
		                // Update second only
		                second = num;
		            }
		        }
		            System.out.println("Second Highest Number: " + second);
		        }
		    }
	

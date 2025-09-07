package PracticeJavaPrograms;

public class TryCatchFinally {

	public static void main(String[] args) {
		        String[] students = {"Subbu", "Paddu", "Ammu"};

		        try {
		            System.out.println("Trying to access the 5th student:");
		            String student = students[5]; // This will throw ArrayIndexOutOfBoundsException
		            System.out.println(student);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Student not found - Invalid index.");
		            System.err.println("Error: " + e.getMessage());
		        } finally {
		            System.out.println("Finally show the operation is completed.");
		        }
		    }
	}










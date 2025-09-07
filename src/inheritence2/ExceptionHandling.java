package inheritence2;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			String []array = null;
			System.out.println(array[0]);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException:" + e.getMessage());
		} finally {
			System.out.println("Finally block excuted");
		}

	}

}

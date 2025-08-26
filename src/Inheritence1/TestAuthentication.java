package Inheritence1;
import java.util.Scanner;
public class TestAuthentication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your user name");
		String s=sc.next();
		System.out.println("Enter your password");
		String s1=sc.next();
//		TestAuthentication t=new TestAuthentication();
		Authenticator a=new DatabaseAuthenticator();
		Authenticator a1= new LDAPAuthenticator();
		if(a.authenticate(s,s1)){
			System.out.println("DatabaseAuthenticator successfully");
		}else {
			System.out.println("DatabaseAuthenticator failed");
		}
		if(a1.authenticate(s,s1)) {
			System.out.println("LDAPAuthenticator successfully");
		}else {
			System.out.println("LDAPAuthenticator failed");
		}
	}	
}

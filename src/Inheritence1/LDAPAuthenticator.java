package Inheritence1;

public class LDAPAuthenticator implements Authenticator{
	@Override
	public boolean authenticate(String user, String password) {
		System.out.println("LDAPAuthenticator");
		return user.equals("subhashinikunduru99@gmail.com")&&password.equals("subhashinikunduru");
	}
}

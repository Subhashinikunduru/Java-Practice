package Inheritence1;

public class DatabaseAuthenticator implements Authenticator{

	@Override
	public boolean authenticate(String user, String password) {
		System.out.println("DatabaseAuthenticator");
		return user.equals("subhashinikunduru99@gmail.com")&&password.equals("subhashinikunduru");
	}

}

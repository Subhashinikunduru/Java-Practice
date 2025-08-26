package inheritence2;

public class Test {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount ();
		CurrentAccount b=new CurrentAccount();
		
		s.deposit(600);
		s.withDraw(100);
		System.out.println("SavingsAccount Balence:"+s.getBalance());
		System.out.println("SavingsAccount Interest:"+s.calculateInterest(20));
		
	    b.deposit(200);
		b.withDraw(100);
		System.out.println("CurrentAccount Balence:"+b.getBalance());
		System.out.println("CurrentAccount Interest:"+b.calculateInterest(10));
		
	}

}

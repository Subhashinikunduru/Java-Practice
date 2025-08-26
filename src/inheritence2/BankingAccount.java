package inheritence2;

public abstract class BankingAccount{
	int accountNumber;
	 double balence;
	
	abstract double calculateInterest(int intrest);
	
	public void deposit(double amount) {
		this.balence+=amount;
		System.out.println("Deposit:"+amount);	
	}
	public void withDraw(double amount) {
		if(this.balence>=amount) {
	        this.balence-=amount;
			System.out.println("withDraw:"+amount);
		}else {
			System.out.println("inSufficient amount");
		}
			
		}
	public double getBalance() {
		return this.balence;
	}
	}


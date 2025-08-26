package inheritence2;

public class CurrentAccount extends BankingAccount{

	@Override
	double calculateInterest(int interestRate) {
		return super.balence*interestRate/100;	
	}

}

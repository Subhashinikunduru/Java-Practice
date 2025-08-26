package inheritence2;

class SavingsAccount extends BankingAccount{
	
	@Override
	
	public double calculateInterest(int interestRate) {
		return super.balence*interestRate/100;	
	}

	
}

package Inheritence1;

public class CreditCard implements Payment {

	@Override
	public void payBill(double amount) {
		System.out.println("Paybill done by CreditCard ");
		
	}

}

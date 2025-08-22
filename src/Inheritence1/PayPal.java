package Inheritence1;

public class PayPal implements Payment{

	@Override
	public void payBill(double amount) {
		System.out.println("Payment done by PayPal");
		
	}

}

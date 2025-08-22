package Inheritence1;

public class UPI implements Payment{
	@Override
	public void payBill(double amount) {
		System.out.println("Payment done by UPI");
		
	}
}

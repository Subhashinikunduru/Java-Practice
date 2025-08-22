package Inheritence1;
import java.util.Scanner;
public class ShoppingCart {
	static Scanner sc=new Scanner(System.in);
      public void Pay(Payment p) {
    	  p.payBill(50000);
      }
	public static void main(String[] args) {
		ShoppingCart s=new ShoppingCart();
		System.out.println("1.CreditCard\n2.UPI\n3.PayPal\nSelect type of payment");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			s.Pay(new CreditCard());
			break;
		case 2:
			s.Pay(new UPI());
			break;
		case 3:
			s.Pay(new PayPal());
			break;
	    default:
	    	System.out.println("invalid payment");
			
		}
		
	}

}

package com.javaintro;

public class bank {
	String accountholdername;
	static long accountnumber = 623101001201L;
	Double bankbalence;
	{
		accountnumber++;
	}

	public void display() {

		System.out.println("name:" + accountholdername);
		System.out.println("accountnumber:" + accountnumber);
		System.out.println("bankbalence:" + bankbalence);
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		bank b = new bank();
		b.accountholdername = "subbu";
		b.bankbalence = 90000D;
		b.display();
		bank b1 = new bank();
		b.accountholdername = "ammu";
		b.bankbalence = 70000D;
		b.display();
		System.out.println("main method ended");

	}

}

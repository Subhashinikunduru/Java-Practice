package com.javaintro;

public class Atm {
	double balence;
	int pin;
	
	Atm(double balence,int pin){
		this.balence=balence;
		this.pin=pin;	
	}
	void depositMethod(double amount) {
		balence=amount;
		System.out.println("Deposit successful:"+balence);	
	}
	void withdrawMethod(double amount) {
		
		
	}
	void pinChange(int newPin) {
		pin=newPin;
		System.out.println("pin change successfully:");	
	}
	void displayTransaction() {
		System.out.println("Transaction details");
		System.out.println("balance:"+balence);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
	}

}

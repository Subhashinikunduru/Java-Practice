package com.javaintro;

import java.util.Scanner;

public class Testbank {
	Scanner sc = new Scanner(System.in);
	long accountnumber;
	String accountholdername;
	Double deposit;
	static String branchname = "main branch";
	static String ifsc = "Abcd123";

	String accountholdername() {
		System.out.println("enter Account Holder name : ");
		return sc.nextLine();
	}

	long accountNumber() {
		System.out.println("enter Account Holder number : ");
		long n = sc.nextInt();
		return n;

	}

	double deposit() {
		System.out.println("enter Deposit amount : ");
		return sc.nextDouble();

	}

	double savingsamount() {
		double samount = 500;
		return samount;

	}

	void show(double savingsAmount, double totalAmount) {
		System.out.println("Name " + accountholdername);
		System.out.println("Number : " + accountnumber);
		System.out.println("Deposit Amount : " + deposit);
		System.out.println("Savings Amount : " + savingsAmount);
		System.out.println("Total Amount : " + totalAmount);

	}

	public static void main(String[] args) {
		
		Testbank t1 = new Testbank();
		t1.accountholdername = t1.accountholdername();
		t1.accountnumber = t1.accountNumber();
		t1.deposit = t1.deposit();
		double d = t1.savingsamount();
		double totalAmount = t1.deposit + d;

		t1.show(d, totalAmount);

	}

}

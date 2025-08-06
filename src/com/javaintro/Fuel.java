package com.javaintro;

import java.util.Scanner;

public class Fuel {
	String vehicleno;
	 double petroquantity;
	 double dieselprice;
	 double totalamount;
	 static double petrol_price=109.90;
	 static double diesel_price=103.55;
	Fuel(String vehiacleno1){
		vehicleno=vehiacleno1;
	}
	void buypetrol(double liters) {
		petroquantity=liters;
		totalamount=liters*petrol_price;
	}
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter vechicle number");
		 String vch = sc.nextLine();
		 Fuel f = new Fuel(vch);
		 System.out.println("enter petrol u want ");
		 String vch1 = sc.nextLine();

	}
	public void display() {
		System.out.println("vechicle number is : "+vehicleno);
		System.out.println("petrol quantity  is : "+petroquantity);
		System.out.println("total amount is : "+totalamount);
	}

}

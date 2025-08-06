package com.javaintro;

public class Testdemovehicle {
	String vehicletype;

	Testdemovehicle(String vehicletype) {
		this.vehicletype = vehicletype;
	}
}

class Car1 extends Testdemovehicle {
	String CarType;
	
	Car1(String vehicletype,String CarType){
		super(vehicletype);
		this.CarType=CarType;
	}
	Car1(String CarType){
		this("Car1",CarType);	
	}
	void displayType() {
		System.out.println(CarType);
		System.out.println(vehicletype);
	}
	
		public static void main(String[] args) {
			Car1 car=new Car1("abcd","xyz");
			car.displayType();
		}
	}

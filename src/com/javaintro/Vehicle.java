package com.javaintro;

public class Vehicle {
	int vehicleNumber;
	String brand;
	double basePrice;

	Vehicle(int vehicleNumber, String brand, double basePrice) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.basePrice = basePrice;
		System.out.println("Constructor from Vehicle is called");
	}

	public static void main(String[] args) {
		System.out.println("Main method from Vehicle");

	}

}

class Car extends Vehicle {
	int noOfSeats;

	Car (int vehicleNumber, String brand, double basePrice, int noOfSeats) {
		super(vehicleNumber, brand, basePrice);
		this.noOfSeats = noOfSeats;
		System.out.println("Constructor from Car is called");

	}

	public static void main(String[] args) {

		System.out.println("Main method from Car");
		Car t = new Car(1234, "Maruti", 200000, 5);
		t.show();

	}

	void show() {
		System.out.println("-------------------------------------");
		System.out.println("Car Vehicle Number = " + vehicleNumber);
		System.out.println("Car Brand = " + brand);
		System.out.println("Car Base Price = " + basePrice);
		System.out.println("Car No.of Seats = " + noOfSeats);
		System.out.println("-------------------------------------");
	}

}

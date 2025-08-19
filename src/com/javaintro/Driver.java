package com.javaintro;

import java.util.Scanner;

class Uber {
	private String vehicletype;
	private double rating;
	private int vehicleno;

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		if (rating >= 1 && rating <= 5) {
			this.rating = rating;
		} else {
			System.out.println("Invalid rating,rating between 1 and 5");
		}

	}

	public int getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(int vehicleno) {
		this.vehicleno = vehicleno;
	}

}

public class Driver extends Uber{
	int num=0;
	String driverName;
	{
		num++;
	}
	
	void setInfo(Scanner s, Driver u) {
		System.out.println("******************************");
		System.out.println("Enter your name("+num+")");
		String name=s.next();
		System.out.println("enter your vehicle type");
		String vehicletype=s.next();
		System.out.println("enter your vehicleno");
		int vehicleno=s.nextInt();
		System.out.println("enter your rating");
		double rating=s.nextDouble();
		u.driverName=name;
		u.setVehicletype(vehicletype);
		u.setRating(rating);
		u.setVehicleno(vehicleno);
		u.displayInfo();
		
	}
	
	void displayInfo() {
		System.out.println("Driver Name ("+num+"): "+driverName);
		System.out.println("vehicletype:" + getVehicletype());
		System.out.println("rating:" + getRating());
		System.out.println("vehicleno:" + getVehicleno());
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Driver d=new Driver();
		d.setInfo(s, d);
		
		Driver d1=new Driver();
		d.setInfo(s, d1);	
		
	}

}
package com.javaintro;

public class Car {
       String model;
       String brand;
       int year;
       int price;
       Car(String model,String brand,int year,int price){
       
       System.out.println("model:"+model+"\nyear:"+year+"\nbrand:"+brand+"\nprice:"+price);
       }
       
	public static void main(String[] args) {
	 Car c=new Car( "suzuki","gtbnht",2020,300000);	
	 Car p=new Car("BMW","abcd",2000,1000000);
	}
}

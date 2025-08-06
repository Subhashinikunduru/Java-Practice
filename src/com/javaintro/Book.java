package com.javaintro;

public class Book {
	int bookid;
	String title;
	String author;
	double price;
	double discountpercentage;

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookid = 123;
		b1.title = "abcd";
		b1.author = "padmaja";
		b1.price = 500;
		b1.discountpercentage = 10;
		double d = (b1.price * b1.discountpercentage) / 100;
		System.out.println(b1.bookid);
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
		System.out.println(b1.price-d);

	}

}

package com.javaintro;

public class FindAge {
	String name;// null--> subbu
	int rollNum;// 0
	static int collegeid;// 0

	public FindAge(int rollNum, String name) {

		this.name = name;
		this.rollNum = rollNum;
	}

	FindAge(String name, int rollNum, int collegeid) {
		this.name = name;
		this.rollNum = rollNum;
		this.collegeid = collegeid;

	}

	FindAge() {

	}

	FindAge(int rollNum, String name, int collegeid) {
		this.name = name;
		this.rollNum = rollNum;
		this.collegeid = collegeid;
	}

	void printDetails() {
		System.out.println("**********************");
		System.out.println("name : " + name);
		System.out.println("roll number : " + rollNum);
		System.out.println("college id :" + collegeid);

	}
	 void printDetails(int a){
		
	}
	

	public static void main(String[] args) {
		FindAge f1 = new FindAge("subbu", 3, 6);

		f1.printDetails();

		FindAge f2 = new FindAge();
		f2.printDetails();

		FindAge f3 = new FindAge(5, "paddu", 2);
		f2.printDetails();

		FindAge f4 = new FindAge(2, "Kusuma");
		f4.printDetails();

	}
}

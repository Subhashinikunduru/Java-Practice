package com.javaintro;

public class StudentCons {
	String name;
	int rollnumber;
	String branch;

	StudentCons(String name) {
		this.name = name;
	}

	StudentCons(String name, int rollnumber) {
		this.name = name;
		this.rollnumber = rollnumber;
	}

	StudentCons(String name, int rollnumber, String branch) {
		this.name = name;
		this.rollnumber = rollnumber;
		this.branch = branch;
	}

	void printDetails() {
		System.out.println("Name:" + name);
		System.out.println("Rollnumber:" + rollnumber);
		System.out.println("Branch:" + branch);
	}

	public static void main(String[] args) {
		StudentCons s = new StudentCons("abcd");
		s.printDetails();
		StudentCons s1 = new StudentCons( "ece");
		s1.printDetails();
		StudentCons s2 = new StudentCons("paddu", 2, "cse");
		s2.printDetails();

	}

}

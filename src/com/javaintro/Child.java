package com.javaintro;

public class Child extends Parent {

	void display() {
		super.display();
		GrandParent p = new GrandParent();
		p.display();
		System.out.println("child display method called");

	}

	public static void main(String args[]) {
		Child c = new Child();
		c.display();

	}
}

class GrandParent {
	void display() {
		System.out.println("GrandParent display method called");

	}
}

class Parent extends GrandParent {
	void display() {
		System.out.println("Parent display method called");

	}

}

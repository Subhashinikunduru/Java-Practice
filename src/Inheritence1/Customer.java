package Inheritence1;

public class Customer {
	String name;
	String address;
	int id;
	Double phoneno;
	Double rating;
//	parameterized constructor with 4 parameters
	Customer(String address,int id,Double phoneno,Double rating){
		this.address=address;
		this.id=id;
		this.phoneno=phoneno;
		this.rating=rating;
	}
	
	
//	parameterized constructor with 5 parameters
 Customer(String name, String address, int id, Double phoneno, Double rating) {
	this.name = name;
	this.address = address;
	this.id = id;
	this.phoneno = phoneno;
	this.rating = rating;
}



//	parameterized constructor with 3 parameters
	Customer(int id,Double phoneno,Double rating){
		this.id=id;
		this.phoneno=phoneno;
		this.rating=rating;
	}
	

//	Constructor overloading
//  parameterized constructor with 2 parameters
	Customer(String name, String address) {
		this(999);
		System.out.println("Parametarised constructor called");
	    this.name = name;
		this.address = address;
	}

//	parameterized constructor with 1 parameters
	Customer(int id) {
		this.id = id;
	}

	// no arg constructor
	Customer() {
		this("subbu", "Markapur");// constructor calling
//    	this();recursive
		System.out.println("no arg Customer");
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.show();

		Customer c1 = new Customer("Ammu", "AP");
		c1.show();

		Customer c2 = new Customer(899);
		c2.show();
		
		Customer c3=new Customer(222,2556192.0,5.0);
		c3.show();
		
		Customer c4=new Customer("kondepalli",454,244265.5,4.0);
		c4.show();
		
	    Customer c5=new Customer("Ammulu","hyd",1212,955037.2,5.4);
	    c5.show();
	}
	

	void show() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(id);
     	System.out.println(phoneno);
		System.out.println(rating);
		System.out.println("******************");
	}
}

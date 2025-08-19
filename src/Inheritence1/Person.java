package Inheritence1;

public class Person {
	private String name;
	protected int sage;
	String address;

	public Person(String name, int sage, String address) {
		this.name = name;
		this.sage = sage;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	protected int getSage() {
		return sage;
	}

	void getAddress() {
		System.out.println("Student address:" + address);
	}

	public void displayInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + sage);
		System.out.println("Address:" + address);
	}
}

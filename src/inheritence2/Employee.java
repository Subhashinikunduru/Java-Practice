package inheritence2;

import Inheritence1.Person;

public class Employee extends Person {
	private double sal;
	private String dept;

	public Employee(String name, int sage, String address, double sal, String dept) {
		super(name, sage, address);
		this.sal = sal;
		this.dept = dept;

	}

	public double getSal() {
		return sal;
	}

	public String getDept() {
		return dept;
	}

	public void displayEmployeeInfo() {
		displayInfo();
		System.out.println("salary:" + sal);
		System.out.println("Department:" + dept);
	}

	public static void main(String[] args) {
		Employee e = new Employee("subbu", 20, "123abc", 50000, "analyist");
		e.displayEmployeeInfo();

	}

}

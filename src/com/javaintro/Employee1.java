package com.javaintro;

public class Employee1 {
	private String name;
	private int id;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayInfo() {
		System.out.println("Name:" + name);
		System.out.println("Id:" + id);
		System.out.println("Salary:" + salary);
	}

}

class Manager extends Employee1 {
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void displayInfo() {
		System.out.println("department:" + department);
		super.displayInfo();
	}

	public class Test {
		public static void main(String[] args) {

			Employee1 e = new Employee1();
			e.setName("subbu");
			e.setId(1);
			e.setSalary(50000);
			System.out.println("Employee1 Information");
			e.displayInfo();

			Manager m = new Manager();
			m.setName("paddu");
			m.setId(2);
			m.setSalary(60000);
			m.setDepartment("Developer");
			System.out.println("Manager details");
			m.displayInfo();

		}

	}
}

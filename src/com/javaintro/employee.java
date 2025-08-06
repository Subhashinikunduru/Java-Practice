package com.javaintro;
public class employee {

	int sal;
	String name;
	int age;

	static int comid;
	static String comname;

	public static void main(String[] args) {
		employee e1 = new employee();
		e1.sal = 20000;
		e1.name = "Ram";
		e1.age = 25;

		comid = 222;
		comname= "TCS";
		
		System.out.println("Company Id:"+comid);
		System.out.println("Company Name:"+comname);
		
		System.out.println("Employee Salary:"+e1.sal);
		System.out.println("Employee Name:"+e1.name);
		System.out.println("Employee age:"+e1.age);
		
			
	}

}

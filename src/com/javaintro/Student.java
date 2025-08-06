package com.javaintro;

public class Student {
	int sid;
	String name;
	int age;

	static String instname;
	static int instid;

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("1st object info********");
		Student a1 = new Student();
		
		instname="Vcube";
		instid=555;
		
		a1.sid=999;
		a1.name="Subbu";
		a1.age=22;
		
		System.out.println("Institution Name:"+ instname);
		System.out.println("Institution ID:"+instid);
	    
		System.out.println("Student ID:"+a1.sid);
		System.out.println("Student Name:"+a1.name);
		System.out.println("Student Age:"+a1.age);
		
		System.out.println("2nd object info********");
		Student a2 = new Student();
		a2.sid=666;
		a2.name="Ammu";
		a2.age=21;
		System.out.println("Institution Name:"+ instname);
		System.out.println("Institution ID:"+instid);
	    
		System.out.println("Student ID:"+a2.sid);
		System.out.println("Student Name:"+a2.name);
		System.out.println("Student Age:"+a2.age);
		
		System.out.println("3rd object info**********");
		Student a3 = new Student();
		instname="Ammu's Tech";
		instid=1555;
		a3.sid=666;
		a3.name="Ammu";
		a3.age=21;
		
		System.out.println("Institution Name:"+ instname);
		System.out.println("Institution ID:"+instid);
	    
		System.out.println("Student ID:"+a3.sid);
		System.out.println("Student Name:"+a3.name);
		System.out.println("Student Age:"+a3.age);
		
		System.out.println("4th object info**********");
		Student a4= new Student();
		System.out.println("Institution Name:"+ instname);
		System.out.println("Institution ID:"+instid);
	    
		System.out.println("Student ID:"+a4.sid);
		System.out.println("Student Name:"+a4.name);
		System.out.println("Student Age:"+a4.age);
		
	}
}

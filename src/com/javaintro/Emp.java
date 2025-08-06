package com.javaintro;

import java.util.Scanner;

public class Emp {
	String empname;
	boolean hasAccessCard;
	boolean biometricMatch;
	boolean isblacklisted;
	boolean doorhasPower;
	
	Emp(String empname,boolean hasAccesCard,boolean biometricmatch,boolean isblacklist,boolean doorhaspower){
		this.empname=empname;
		this.hasAccessCard=hasAccesCard;
		this.biometricMatch=biometricmatch;
		this.isblacklisted=isblacklist;
		this.doorhasPower= doorhaspower;	
	}
	boolean canAccess() {
		return hasAccessCard &&hasAccessCard&&(!isblacklisted)&&doorhasPower;
	}
	void display() {
		System.out.println("Employee name:"+empname);
		System.out.println("AccessCard:"+canAccess());
	}

	public static void main(String[] args) {
		Emp e=new Emp("abcd",true,true,false,true);
		e.display();
		Emp e1=new Emp("abcd",true,true,true,true);
		e1.display();
		Emp e2=new Emp("abcd",false,true,true,true);
		e2.display();
	}

}

package com.javaintro;

public class Constructor {

	Constructor() {
		System.out.println("no arg Constructor called");
	}

	Constructor( int arg1) {
		this();
		System.out.println("Constructor with one argument called:"+arg1);
	}

	Constructor( int arg1,int arg2){
		this(arg1);
		System.out.println("Constructor with two arguments called:"+arg1+arg2);
	}

	Constructor(int arg1,int arg2,int arg3) {
		this(arg2,arg3);
		System.out.println("Constructor with three arguments called:"+arg1+arg2+arg3);
	}

	public static void main(String[] args) {
		Constructor c=new Constructor(1,2,3);

	}

}

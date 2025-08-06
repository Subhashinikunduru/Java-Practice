package com.javaintro;

public class garbage {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

	public static void main(String[] args) {
		garbage g1=new garbage();
		garbage g2=new garbage();
		garbage g3=new garbage();
		garbage g4=new garbage();
		g1=null;//nulifying 
		g2=g3;//reassining the value
		System.gc();
		System.out.println(g1);//@4517d9a3
		System.out.println(g2);//@372f7a8d
		System.out.println(g3);//@2f92e0f4
		System.out.println(g4);//@28a418fc

	}

}

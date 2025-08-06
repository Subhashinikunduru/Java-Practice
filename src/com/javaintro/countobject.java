package com.javaintro;

public class countobject {
	
			static int count=0;
			{
				count=count+1;
			}
			public static void main(String[] args) {
				countobject c1=new countobject();
				countobject c2=new countobject();
				countobject c3=new countobject();
			System.out.println("number of objects created:"+count);
				

		}
}



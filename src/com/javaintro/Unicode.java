package com.javaintro;

public class Unicode {
	int unicode (char a) {
	return (int)a;
	}
	char unicode(int a) {
	return (char)a;
	}

	public static void main(String[] args) {
		Unicode u=new Unicode();
		System.out.println(u.unicode(65));
		System.out.println(u.unicode('A'));
		
	}

}

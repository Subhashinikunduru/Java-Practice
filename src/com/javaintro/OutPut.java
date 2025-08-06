package com.javaintro;

public class OutPut {

	public static void main(String[] args) {
		int i=0;
		while (i<3) {
			int j=0;
			while(j<3) {
					System.out.println("("+i+","+j+")");
					if(j==1)i++;
					j++;
				}
			i++;
			}
		}
	}



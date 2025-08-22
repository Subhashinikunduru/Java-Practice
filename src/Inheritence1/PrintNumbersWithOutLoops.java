package Inheritence1;

import java.util.Scanner;

public class PrintNumbersWithOutLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        System.out.println("Enter b value");
        int m=sc.nextInt();
        printValues(n,m);
        
	}

	private static void printValues(int n, int m) {
		System.out.println(n++);
		if(n<=m+1&&n!=m+1) {
			 printValues(n,m);
		     
		}
		
	}

}

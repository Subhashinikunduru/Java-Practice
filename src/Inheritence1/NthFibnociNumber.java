package Inheritence1;

import java.util.Scanner;

public class NthFibnociNumber {
//	0 1 1 2 3 5 8 13---->0+1=1,1+1=2,2+3=5........
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
getnthfinnocinumber(n);
	}

	public static void getnthfinnocinumber(int n) {
		int count =0;
		int a=0;
		int b=1;
		while(true) {
			count++;
			if(count==n) {
				System.out.println(a);
				break;
			}
			int c=a+b;
			a=b;
			b=c;
	}
}
}
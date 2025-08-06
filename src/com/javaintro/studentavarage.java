package com.javaintro;

public class studentavarage {

	static int stuid;
	static String stuname;
	static int stuage;
	static int sub1 = 60;
	static int sub2 = 75;
	static int sub3 = 80;

	public static void main(String[] args) {
		int stuid = 555;
		String stuname = "Raghu";
		int stuage = 18;
		double avg;
		avg = (sub1+sub2+sub3/ 3);
		System.out.println("studentavarage id:"+stuid);
		System.out.println("studentavarage name:"+stuname);
		System.out.println("studentavarage age:"+stuage);
        if(avg>35)
		{
		
		System.out.println("true");
		}
		else{
				System.out.println("false");
		 }
	}
}

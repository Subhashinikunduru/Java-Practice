package com.javaintro;

public class grocerybilling {
	public static void main(String[] args) {
	 double rice_price=45.0;
	 double sugar_price=40.0;
	 double oil_price=130.0;
	
	
	 double ricequality=2.0;
	 double sugarquality=1.0;
	 double oilquality=0.5;
	 double amountpaid=300.0;
	 
	 double ricecost=ricequality*rice_price;
	 double sugarcost=sugarquality*sugar_price;
	 double oilcost=oilquality*oil_price;
	 
	 double totalbill=ricecost+sugarcost+oilcost;
	 double change=amountpaid-totalbill;
	 System.out.println("grocerybil**********************");
	 System.out.println("rice("+ricequality+"kg):/-"+ricecost);
	 System.out.println("sugar("+sugarquality+"kg):/-"+sugarcost);
	 System.out.println("oil("+oilquality+"kg):/-"+oilcost);
	 System.out.println("*****************");
	 System.out.println("totalbill:/-"+totalbill);
	 System.out.println("amount paid:/-"+amountpaid);
	 System.out.println("change to return:/-"+change);
	 
		
	}

}

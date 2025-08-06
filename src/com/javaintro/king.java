package com.javaintro;

public class king {
	Double salary1=27000D;
	Double pfdeduction=5D;
	Double cgstdeduction=7D;
	Double dacredits=3D;
	{
		Double annualsalary=salary1*12D;
	    Double pf=(annualsalary*pfdeduction)/100;
	    Double cgst=(annualsalary*cgstdeduction)/100;
	    Double da=(annualsalary*dacredits)/100;
	    Double finalsalary=(annualsalary-pf-cgst)+da;
	    System.out.println("finalsalary:"+finalsalary);
	}

	public static void main(String[] args) {
		king k=new king();
		

	}

}

package inheritence2;

public class ReverseEachElementArray {

	public static void main(String[] args) {
		int[]num= {12,13,120,56};
		for(int i=0;i<num.length;i++) {
			System.out.println(revnumber(num[i]));
		}	
	}

	private static String revnumber(int i) {
		String s="";
		while(i!=0){
		   s+=Integer.toString(i%10);
		   i/=10;	
		}
		return s;
	}
}

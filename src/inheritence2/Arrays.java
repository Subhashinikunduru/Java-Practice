package inheritence2;

import java.util.stream.IntStream;

public class Arrays {

	private static char[] n;

	public static void main(String[] args) {
		int[] num = { 122,123,256,342};
		int count = 0;
	
				for(int n:num) {
					count+=get2scount(n);
				}
				System.out.println(count );
		
//		for (int n : num) {
//			String numstr = String.valueOf(n);
//			for (char c : numstr.toCharArray()) {
//				if (c == '2') {
//					count++;
//				}
//			}
//
//		}
//
//		System.out.println(count);
		
	}

	public static int get2scount(int num) {
		int count=0;
		while(num>0) {
			int rem=num%10;
			if(rem==2) {
				count++;
			}
			num/=10;
		}
		return count;
	}
	
}

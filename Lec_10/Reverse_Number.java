package Lec_10;
import java.util.*;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n=2346;
//		int rev=0;
//		
//		while(n != 0) {
//			
//			int rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		
//		System.out.println(rev);
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		
		while(n != 0) {
			
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		System.out.println(rev);
		
	}

}

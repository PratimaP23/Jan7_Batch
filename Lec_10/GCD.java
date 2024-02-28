package Lec_10;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int divisor=36;
//		int dividend=60;
//		
//		while(dividend%divisor != 0) {
//			
//			int rem=dividend%divisor;
//			
//			dividend=divisor;
//			divisor=rem;
//		}
//		
//		System.out.println(divisor);
		
		Scanner s=new Scanner(System.in);
		int divisor=s.nextInt();
		int dividend=s.nextInt();
		
		while(dividend%divisor != 0) {
			int rem=dividend%divisor;
		
			dividend=divisor;
			divisor=rem;

		}
		System.out.println(divisor);

	}

}

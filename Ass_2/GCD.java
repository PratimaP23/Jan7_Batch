package Ass_2;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int dividend=s.nextInt();
		int divisor=s.nextInt();
		
		while(dividend%divisor != 0) {
			
			int rem=dividend%divisor;
			dividend=divisor;
			divisor=rem;
			
		}
		
		System.out.println(divisor);

	}

}

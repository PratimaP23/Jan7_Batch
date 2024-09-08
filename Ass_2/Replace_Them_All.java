package Ass_2;

import java.util.Scanner;

public class Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		
		System.out.println(replacethemall(n));

	}
	
	public static long replacethemall(long n) {
		
		long sum=0;
		long mult=1;
		
		if(n==0) {
			
			return 5;
		}
		
		while(n!=0) {
			
			long rem=n%10;
			
			if(rem==0) {
				
				rem=5;
				
			}
			
			sum=sum+rem*mult;
			mult=mult*10;
			n=n/10;
		}
		
		return sum;
		
		
	}

}

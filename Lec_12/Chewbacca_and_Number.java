package Lec_12;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		
		System.out.println(Chewbacca(n));

	}
	
	public static long Chewbacca(long n) {
		
		long sum=0;
		long mult=1;
		
		while(n>9) {
			
			long rem=n%10;
			
			if(rem>=5) {
				
				sum=sum+(9-rem)*mult;
				
			}else {
				
				sum=sum+rem*mult;
			}
			
			n=n/10;
			mult=mult*10;
		}
		
		if (n == 9 || n < 5) {

			sum = sum + n * mult;

		} else {

			sum = sum + (9 - n) * mult;

		}
		
		return sum;
	}


}

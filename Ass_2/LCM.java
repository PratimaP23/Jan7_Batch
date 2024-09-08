package Ass_2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		System.out.println(lcm(n1,n2));
		
		}
	
	public static int lcm(int n1,int n2) {
		
		int X = (n1*n2)/gcd(n1,n2);
		
		return X;
	}
	
	public static int gcd(int divisor,int dividend) {
		
		while(dividend%divisor != 0) {
			 
			int rem=dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}
		
	     return divisor;
	}

}

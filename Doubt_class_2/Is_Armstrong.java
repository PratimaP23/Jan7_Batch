package Doubt_class_2;

import java.util.Scanner;

public class Is_Armstrong {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		if (n == 0) {

			System.out.println("true");
			return;

		}
		
		int orginalN=n;
		
		int digits=0;
		
		while(n!=0) {
			
			int rem=n/10;
			
			digits++;
			
			n=n/10;
		}
		
		isArmstrong(orginalN,digits);
	}
	
	public static void isArmstrong(int n,int digits) {
		
		int sum=0;
		int orginalN=n;
		
		while(n!=0) {
			
			int rem=n%10;
			
			sum+=Math.pow(rem, digits);
			
			n=n/10;
			
		}
		
		if(sum==orginalN) {
			
			System.out.println("true");
			
		}else {
			
			System.out.println("false");
			
		}
	}
}

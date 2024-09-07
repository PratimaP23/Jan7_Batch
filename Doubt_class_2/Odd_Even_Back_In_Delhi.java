package Doubt_class_2;

import java.util.Scanner;

public class Odd_Even_Back_In_Delhi {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		while(t>0) {
			
			int n=s.nextInt();
			
			oddEven(n);
			
			t--;
		}
	}
	
	public static void oddEven(int n) {
		
		int oddSum=0;
		int evenSum=0;
		
		while(n!=0) {
			
			int rem=n%10;
			
			if(rem%2==0) {
				
				evenSum+=rem;
				
			}else {
				
				oddSum+=rem;
				
			}
			
			n=n/10;
		}
		
		if(oddSum%3==0 || evenSum%4==0) {
			
			System.out.println("Yes");
			
		}else {
			
			System.out.println("No");
			
		}	
	}
}

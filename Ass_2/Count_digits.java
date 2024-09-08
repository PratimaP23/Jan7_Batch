package Ass_2;

import java.util.Scanner;

public class Count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		byte digit=s.nextByte();
		
		System.out.println(countdigit(n,digit));

	}
	
	public static int countdigit(int n,int digit) {
		
		int count=0;
		while(n!=0) {
			
			int rem=n%10;
			
			if(rem==digit) {
				
				count++;
			}
			
			n=n/10;
		}
		
		return count;
	}

}

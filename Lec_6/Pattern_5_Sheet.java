package Lec_6;

import java.util.Scanner;

public class Pattern_5_Sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=0;
		int nst=n;
		
		while(row<=n) {
			//Print the space
			int i=1;
			while(i<=nsp) {
				
				System.out.print(" "+" ");
				i=i+1;
			}
			//Print the dash
			int j=1;
			while(j<=nst) {
				
				System.out.print("*"+" ");
				j=j+1;
			}
			
			//Preparation for the next row
			
			nsp=nsp+1;
			nst=nst-1;
			
			System.out.println();
			row=row+1;
		}
		

	}

}

package Lec_6;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=n-1;
		int nst=1;
		
		while(row<=n) {
			//Print the space
			int i=1;
			while(i<=nsp) {
				
				System.out.print(" ");
				i=i+1;
			}
			//Print the star
			int j=1;
			while(j<=nst) {
				
				System.out.print("*");
				j=j+1;
				}
			//Preparation for the next row
			nsp=nsp-1;
			nst=nst+2;
			
			System.out.println();
			row=row+1;
		}

	}

}

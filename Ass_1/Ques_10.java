package Ass_1;

import java.util.Scanner;

public class Ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=n;
		int nsp=-1;
		
		while(row<=2*n-1) {
			
			//left star
			int i=1;
			while(i<=nst) {
				System.out.print("*");
				i=i+1;
			}
			//space
			int j=1;
			while(j<=nsp) {
				System.out.print(" ");
				j=j+1;
			}
			//Right star
			int k=1;
			if(row==1 || row==(2*n-1)) {
				k=2;
			}
			while(k<=nst) {
				System.out.print("*");
				k=k+1;
			}
			//Preparation for the next row
			if(row<n) {
			nst=nst-1;
			nsp=nsp+2;
			}else {
		    nst=nst+1;
			nsp=nsp-2;
			}
			
			System.out.println();
			row=row+1;
		}
		
     }
	
  }

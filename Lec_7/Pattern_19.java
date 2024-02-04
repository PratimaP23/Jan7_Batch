package Lec_7;
import java.util.*;

public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=(n+1)/2;
		int nsp=-1;
		
		while(row<=n) {
			
			//left star
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i=i+1;
			}
			//space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			//Right star
			int k=1;
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=nst) {
				System.out.print("*"+" ");
				k=k+1;
			}
			//Preparation for the next row
			if(row<(n+1)/2) {
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

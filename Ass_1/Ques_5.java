package Ass_1;
import java.util.*;

public class Ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp1=n-1;
		int nst=1;
		int nsp2=n-2;
		
		
		while(row<=n) {
			
			//left space
			int j=1;
			while(j<=nsp1) {
				System.out.print(" ");
				j=j+1;
			}
			
			//left star
			//first row and last row stars
			if (row==1 || row==n) {
				int i=1;
				while(i<=n) {
					System.out.print("*");
					i=i+1;
				}
			}else {
		    int k=1;
			while(k<=nst) {
				System.out.print("*");
				k=k+1;
			}
			}
			//middle space
			int l=1;
			while(l<=nsp2) {
				System.out.print(" ");
				l=l+1;
			}
			
			//Right star
			int m=1;
			if(row>=2 && row<n) {
			while(m<=nst) {
				System.out.print("*");
				m=m+1;
			}
			}
			//Preparation for the next row
			 nsp1=nsp1-1;
			
			System.out.println();
			row=row+1;
		}
	}

}

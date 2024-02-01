package Lec_6;
import java.util.*;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1; //number of stars in rowth row
		
		while(row<=n) {
			
			//Print the stars
			int i=1;
			while(i<=nst) {
				
				System.out.print("*");
				i=i+1;
			}
			
			//Preparation for the next row
			nst=nst+1;
			
			System.out.println();
			row=row+1;
		}

	}

}

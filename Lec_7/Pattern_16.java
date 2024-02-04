package Lec_7;
import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=n-1;
		int nst=n;
		
		while(row<=2*n-1) {
			//space
			int i=1;
			while(i<=nsp) {
				
				System.out.print(" "+" ");
				i=i+1;
			}
			//star
		    int j=1;
		    while(j<=nst) {
		    	
		    	System.out.print("*"+" ");
		    	j=j+1;
		    }
		    //Preparation for the next row
		    if(row<n) {
		    	nsp=nsp-1;
		    	nst=nst-1;
		    }else {
		    	nsp=nsp+1;
		    	nst=nst+1;
		    }
		    
		    System.out.println();
		    row=row+1;
		}

	}

}

package Lec_7;
import java.util.*;

public class Pattern_14_Sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=n-1;
		int nst=1;
		
		while(row<=2*n-1) {
			//print the space
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			//print the space
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
			}
			if(row<n){
				nsp=nsp-1;
				nst=nst+1;
			}else {
				nsp=nsp+1;
				nst=nst-1;
			}
			
			System.out.println();
			row=row+1;
		}

	}

}

package Doubt_class_1;
import java.util.*;

public class Pattern_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=n;
		int nsp=-1;
		
		while(row<=(2*n-1)){
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
			//preparation for the next row
			if(row<n) {
				nst--;
				nsp+=2;
			}else {
				nst++;
				nsp-=2;
			}
			
			System.out.println();
			row=row+1;
		}

	}

}

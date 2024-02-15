package Doubt_class_1;
import java.util.*;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=0;
		int nst=1;
		
		while(row<n) {
			//star
			
			int i=0;
			int ncr=1;
			
			while(i<nst) {
				
			System.out.print(ncr+"\t");
			//Preparation for next nCr
			ncr=((row-i)*(ncr))/(i+1);
			i=i+1;
			}
			
			//Preparation for the next row
			nst=nst+1;
			
			System.out.println();
			row=row+1;
		}

	}

}

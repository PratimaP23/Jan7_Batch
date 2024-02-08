package Lec_5;
import java.util.*;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=n;
		
		while(row<=2) {
			
			int i=1;
			
			while(i<=nst) {
				
				System.out.print("* "+i);
				i=i+1;
			}

			
			System.out.println();
			
			row=row+1;
			
			}
             }

}

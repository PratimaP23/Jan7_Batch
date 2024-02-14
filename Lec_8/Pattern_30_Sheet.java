package Lec_8;
import java.util.*;

public class Pattern_30_Sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=n;
		int row_val=n;
		
		while(row<=n) {
			
			//star
			int i=1;
			int col_val=row_val;
			while(i<=nst) {
				System.out.print(col_val+" ");
				col_val=col_val-1;
				i=i+1;
			}
			System.out.println();
			row=row+1;
		}
		
	}

}

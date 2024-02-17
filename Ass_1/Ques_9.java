package Ass_1;
import java.util.*;

public class Ques_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=n+1;
		int row_val1=1;
		int row_val2=1;
		
		while(row<=n) {
			//left star
			int i=1;
			int col_val1=row_val1;
			while(i<=nst) {
				System.out.print(col_val1+"\t");
				col_val1=col_val1+1;
				i=i+1;
			}
			//space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+"\t");
				j=j+1;
			}
			//Right star
			int k=1;
			if(row==n) {
				k=2;
			}
			if(row==n) {
				row_val2=row_val2-1;
			}
			int col_val2=row_val2;
			
			while(k<=nst) {
				System.out.print(col_val2+"\t");
				col_val2=col_val2-1;
				k=k+1;
			}
			//Preparation for the next row
			nst=nst+1;
			nsp=nsp-2;
			row_val2=row_val2+1;
			
			System.out.println();
			row=row+1;
		}

	}

}

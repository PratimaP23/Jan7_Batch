package Ass_1;
import java.util.*;

public class Ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int glo_val=1;
		
		while(row<=n) {
			//Star
			int i=1;
			while(i<=nst) {
				System.out.print(glo_val+"\t");
				glo_val++;
				i=i+1;
			}
			//Preparation for the next row
			nst=nst+1;
			
			System.out.println();
			row=row+1;
		 }
		
	  }
	}



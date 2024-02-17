package Ass_1;
import java.util.*;

public class Ques_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		
		while(row<=n) {
			
			//star
			int i=1;
			while(i<=nst) {
				System.out.print("*"+"\t");
				i=i+1;
			}
			
			//preparation for the next row
			nst=nst+1;
			
			System.out.println();
			row=row+1;
		}

	}

}

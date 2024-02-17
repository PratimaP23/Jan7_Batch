package Ass_1;
import java.util.*;

public class Ques_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int a=0;
		int b=1;
		
		while(row<=n) {
			
			//star
			int i=1;
			while(i<=nst) {
			System.out.print(a+"\t");
			int c=a+b;
			a=b;
			b=c;
			i=i+1;
			}
			//preparation for the next row
			nst=nst+1;
			
			
			System.out.println();
			row=row+1;
		}
		
	}

}

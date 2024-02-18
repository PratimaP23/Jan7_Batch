package Pattern_Sheet_Ques;
import java.util.Scanner;

public class Ques_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=n;
		int row_val=n;
		int p=n;
		
		while(row<=n) {
			
			//star
			int i=1;
			int col_val=row_val;
			while(i<=nst) {
				if(i==p) {
					System.out.print("*"+" ");
				}
				if(i<p){
				System.out.print(col_val+" ");
				}else if(i>p) {
					System.out.print(col_val+" ");
				}
				col_val=col_val-1;
				i=i+1;
			}
			//preparation for the next row
			p=p-1;
			
			System.out.println();
			row=row+1;
		}
		

	}

}

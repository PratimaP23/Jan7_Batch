package Pattern_Sheet_Ques;
import java.util.*;

public class Ques_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=n-1;
		int nst=1;
		
		while(row<=n) {
			//space
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			//star
			int j=1;
			while(j<=nst) {
				
				if(row==1) {
					System.out.print(1+" ");
				}else if(j==1 || j==2*row-1) {
					System.out.print(row+" ");
				}else {
					System.out.print(0+" ");
				}
				//System.out.print("*"+" ");
				j=j+1;
			}
			//preparation for the next row
			nsp=nsp-1;
			nst=nst+2;
			
			System.out.println();
			row=row+1;
		}

	}

}

package Pattern_Sheet_Ques;
import java.util.*;

public class Ques_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=n-1;
		int nst=1;
		int rowval1=0;
		int rowval2=n;
		
		while(row<=n) {
			//space
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			//star
			int j=1;
			int colval=rowval2;
			while(j<=nst) {
				if(j<(nst+1)/2) {
				System.out.print(colval+" ");
				colval=colval+1;
				}else if(j>(nst+1)/2){
					System.out.print(colval-1+" ");
					colval=colval-1;
				}else if(row==1 || j==(nst+1)/2){
					System.out.print(rowval1+" ");
				}
				j=j+1;
			}
			//preparation for the next row
			nsp=nsp-1;
			nst=nst+2;
			rowval2=rowval2-1;
			
			System.out.println();
			row=row+1;
		}

	}

}

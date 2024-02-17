package Ass_1;
import java.util.*;

public class Ass_Ques_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=2*n-1;
		int rowval1=n;
		int rowval2=n;
		
		while(row<=(2*n+1)) {
			//left star
			int i=1;
			int colval1=rowval1;
			while(i<=nst) {
				System.out.print(colval1+" ");
				colval1=colval1-1;
				i=i+1;
			}
			//space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			//Right star
			int k=1;
			int colval2=rowval2;
			if(row==(n+1)) {
				k=2;
				colval2=1;
			}
			while(k<=nst) {
				System.out.print(colval2+" ");
				colval2=colval2+1;
				k=k+1;
			}
			if(row<(n+1)) {
			nst=nst+1;
			nsp=nsp-2;
			rowval2=rowval2-1;
			}else {
			nst=nst-1;
			nsp=nsp+2;
			rowval2=rowval2+1;
			}
			
			System.out.println();
			row=row+1;
		}
		
	}

}

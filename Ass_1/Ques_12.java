package Ass_1;
import java.util.*;

public class Ques_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp1=n-1;
		int nst=1;
		int nsp2=-1;
		int rowval1=1;
		int rowval2=1;
		
		while(row<=n) {
			//left space
			int i=1;
			while(i<=nsp1) {
				System.out.print(" "+" ");
				i=i+1;
				}
			//left star
			int j=1;
			int colval1=rowval1;
			while(j<=nst) {
				System.out.print(colval1+" ");
				colval1=colval1-1;
				j=j+1;
			}
			//Middle space
			int k=1;
			while(k<=nsp2) {
				System.out.print(" "+" ");
				k=k+1;
			}
			//Right star
			int l=1;
			if(row==1 || row==n) {
				l=2;
			}
			int colval2=rowval2;
			while(l<=nst) {
				System.out.print(colval2+" ");
				colval2=colval2+1;
				l=l+1;
			}
			//Preparation for the next row
			if(row<(n/2)+1) {
				nsp1=nsp1-2;
				nst=nst+1;
				nsp2=nsp2+2;
				rowval1=rowval1+1;
			}else {
			    nsp1=nsp1+2;
			    nst=nst-1;
			    nsp2=nsp2-2;
			    rowval1=rowval1-1;
			}
			
			System.out.println();
			row=row+1;
		}

	}

}

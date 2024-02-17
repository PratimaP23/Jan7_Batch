package Ass_1;
import java.util.Scanner;

public class Ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=n/2;
		
		while(row<=n) {
			//space
			
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+"\t");
				i=i+1;
			}
		  //star
			
			int j=1;
			while(j<=nst) {
				System.out.print("*"+"\t");
				j=j+1;
			}
			//Preparation for the next row
			
			if(row<(n/2)+1) {
				nsp=nsp-1;
				nst=nst+2;
			}else {
				nsp=nsp+1;
				nst=nst-2;
			}
			
			System.out.println();
		    row=row+1;
		}

	}

}

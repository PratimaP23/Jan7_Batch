package Lec_6;
import java.util.*;

public class Pattern_7_Sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=n-2;
		int nst=1;
		
		while(row<=n) {
		if (row == 1 || row == n) {
			int i = 1;
			while (i <= n) {
				System.out.print("*"+" ");
				i = i + 1;
			}
		} else {
			int j = 1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
			}
			int k=1;
			while(k<=nsp) {
				System.out.print(" "+" ");
				k=k+1;
			}
			int l=1;
			while(l<=nst) {
				System.out.print("*"+" ");
				l=l+1;
			}
		}
		System.out.println();
                row=row+1;
	}

    }
	
}

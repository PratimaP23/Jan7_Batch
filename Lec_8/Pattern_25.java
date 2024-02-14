package Lec_8;

import java.util.Scanner;

public class Pattern_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nsp=n-1;
		int nst=1;
		int global=1;

		while (row <= n) {
			// space
			int i = 1;
			while (i <= nsp) {
				System.out.print(" "+"\t");
				i = i + 1;
			}
			// star
			int j = 1;
			while (j <= nst) {
				System.out.print(global+"\t");
				global++;
				j = j + 1;
				

			}
			// Preparation for the next row
			nsp = nsp - 1;
			nst = nst + 2;

			System.out.println();
			row = row + 1;
		}

	}

}

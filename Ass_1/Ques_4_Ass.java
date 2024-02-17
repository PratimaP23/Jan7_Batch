package Ass_1;
import java.util.*;

public class Ques_4_Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		
		
		while(row<=n) {
			//star
			int i=1;
			while(i<=row) {
				if(row==1) {
					System.out.print(1);
				}else if(i==1 || i==row) {
					System.out.print(row);
				}else {
					System.out.print(0);
				}
				i=i+1;
			}
			//Preparation for the next row
			
			System.out.println();
			row=row+1;
		}

	}

}

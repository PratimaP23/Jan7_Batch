package Pattern_Sheet_Ques;
import java.util.*;

public class Ques_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int row=1;
		int nst=1;
		int p=1;
		
		while(row<=2*n-1) {
			//star
			int i=1;
			while(i<=nst) {
				if(i%2==0) {
				System.out.print("*"+" ");
				}else {
					if(row<=n) {
					System.out.print(row+" ");
					}else {
		                 System.out.print(row-p+1+" ");
					}
				}
				i=i+1;
			}
			//preparation for the next row
			if(row<n) {
			    nst=nst+2;
			}else {
				nst=nst-2;
				p=p+2;
			}
			
			System.out.println();
			row=row+1;
		}

	}

}

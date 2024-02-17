package Ass_1;
import java.util.*;

public class Ques_11_Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int row=1;
        int nst=1;
        int nsp=1;
        
        while(row<=2*n-1) {
        	
        	if(row%2==0) {
        		int i=1;
        		while(i<=nsp) {
        			System.out.print(" ");
        			i=i+1;
        		}
        	}else {
        		int j=1;
        		while(j<=nst) {
        			System.out.print("*");
        			j=j+1;
        		}
        	}
        	//Preparation for the next row
        	if(row%2==0) {
        		nst=nst+1;
        	}else {
        		nsp=nsp+1;
        	}
        	
        	
        	System.out.println();
        	row=row+1;
        }
	}

}

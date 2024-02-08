package Lec_7;
import java.util.*;

public class Pattern_20_Sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int row=1;
	    int nsp1=(n-1)/2;
	    int nst=1;
	    int nsp2=-1;
	    
	    while(row<=n) {
	    	//Left space
	    	int i=1;
	    	while(i<=nsp1) {
	    		System.out.print(" ");
	    		i=i+1;
	    	}
	    	//left star
	    	int j=1;
	    	while(j<=nst) {
	    		System.out.print("*");
	    		j=j+1;
	    	}
	    	//Right space
	    	int k=1;
	    	while(k<=nsp2) {
	    		System.out.print(" ");
	    		k=k+1;
	    	}
	    	//Right star
	    	int l=1;
	    	while(l<=nst) {
	    		System.out.print("*");
	    		l=l+1;
	    	}
	    	//Preparation for the next row
	    	if(row<(n+1)/2) {
	    		nsp1=nsp1-1;
	    		nsp2=nsp2+2;
	    	}else{
	    	        nsp1=nsp1+1;
    		        nsp2=nsp2-2;
		}
	    	System.out.println();
	    	row=row+1;
	    }
	    
      }

}

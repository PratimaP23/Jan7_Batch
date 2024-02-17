package Ass_1;
import java.util.*;

public class Ques_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       
       int row=1;
       int nsp=0;
       int nst=(2*n+1);
       int rowval=n;
       
       while(row<=(2*n+1)) {
    	   //space
    	   int i=1;
    	   while(i<=nsp) {
    		   System.out.print(" "+" ");
    		   i=i+1;
    	   }
    	   //star
    	   int j=1;
    	   int colval=rowval;
    	   while(j<=nst) {
    		   System.out.print(colval+" ");
    		   if(j<(nst+1)/2) {
    			   colval=colval-1;
    		   }else {
    			   colval=colval+1;   
    		   }
    		   j=j+1;
    	   }
    	   //Preparation for the next row
    	   if(row<(n+1)) {
    		   nsp=nsp+1;
    		   nst=nst-2;
    		   rowval=rowval-1;
    	   }else {
    		   nsp=nsp-1;
		       nst=nst+2;
		       rowval=rowval+1;
           }
    	   
    	   System.out.println();
    	   row=row+1;
       }
       
	}

}

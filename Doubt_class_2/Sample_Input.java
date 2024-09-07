package Doubt_class_2;

import java.util.Scanner;

public class Sample_Input {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int cumulativeSum=0;
		
		while(s.hasNextInt()) {
			
		    int n=s.nextInt();
		    
		    cumulativeSum+=n;
		    
		    if(cumulativeSum<0) {
		    	
		    	break;
		    	
		    }
		    
		    System.out.println(n);
		  
		}
	}
}

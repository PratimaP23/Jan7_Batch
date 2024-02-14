package Lec_9;
import java.util.*;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
	    int count=0;
	    
	    for(int i=1;i<=n;i++) {
	    	
	    	if(n%i==0) {
	    		
	    		count++;
	    	}
	    }
	    
	    if(count==2) {
	    	
	    	System.out.println("Prime");
	    }else {
	    	System.out.println("Not Prime");
	    }

	}

}

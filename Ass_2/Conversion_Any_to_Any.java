package Ass_2;
import java.util.*;

public class Conversion_Any_to_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int source=s.nextInt();
		int dest=s.nextInt();
		int n=s.nextInt();
		
		//source to decimal
		int sum=0;
	    int mult=1;
	    
		while(n != 0) {
			
			int rem=n%10;
			
		    sum=sum+rem*mult;
		    
			mult=mult*source;
			n=n/10;
		}
           
		decimaltodest(sum,dest);
	}
	
	public static void decimaltodest(int n,int dest) {
		
		int ans=0;
	    int mult=1;
	    
		while(n !=0) {
			
			int rem=n%dest;
			
			ans=ans+rem*mult;
			
			mult=mult*10;
			n=n/dest;
		}
		
       System.out.println(ans);
	
	}

}

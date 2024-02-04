package Lec_7;
import java.util.*;

public class Print_Natural_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int mult=1;
		
		for(int i=1;i<=n;i++) {
			
			mult=mult*i;
			
			
		}
		
		System.out.println(mult);
		}

}

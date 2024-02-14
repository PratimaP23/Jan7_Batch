package Lec_9;
import java.util.*;

public class Sum_Natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			
			sum=sum+i;
		}
            System.out.println(sum);
	}

}

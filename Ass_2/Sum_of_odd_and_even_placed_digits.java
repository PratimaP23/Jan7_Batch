package Ass_2;
import java.util.Scanner;

public class Sum_of_odd_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		sumofdigits(n);

	}
	
	public static void sumofdigits(int n) {
		
		int place=1;
		int sum1=0;
		int sum2=0;
		
		while(n!=0) {
			
			int rem=n%10;
			
			if(place%2==0) {
				
				sum1=sum1+rem;
				
			}else {
				
				sum2=sum2+rem;
			}
			
			place++;
			n=n/10;
		}
		
		System.out.println(sum2);
		System.out.println(sum1);
	}

}

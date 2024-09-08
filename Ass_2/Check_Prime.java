package Ass_2;
import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int count=0;
		
		for(int i=2;i<n-1;i++) {
			
			if(n%i==0) {
				count++;
			}
		}
			if(count>0) {
				System.out.println("Not Prime");
			}else {
				System.out.println("Prime");
			
		}

	}

}

package Lec_4;
import java.util.*;

public class Max_of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c) {
			
			System.out.println("a is max");
		}else if(b>c) {
			
			System.out.println("b is max");
		}else{
			
			System.out.println("c is max");
		}
	}

}

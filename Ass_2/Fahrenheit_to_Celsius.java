package Ass_2;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int min=s.nextInt();
		int max=s.nextInt();
		int step=s.nextInt();
		
		
		for(int i=min;i<=max;i=i+step) {
		
			int F=i;
			int C=(int)((5.0/9)*(F-32));
			System.out.println(F+"\t"+C);
		}
	}

}

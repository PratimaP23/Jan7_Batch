package Lec_5;
import java.util.*;

public class Grading_of_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		
		if(marks>90) {
			
			System.out.println("O");
			
			
		}else if(marks>80 && marks<=90) {
			
			System.out.println("A+");
			
		}else if(marks>70 && marks<=80) {
			
			System.out.println("A");
			
		}else if(marks>50 && marks<=70) {
			
			System.out.println("P");
			
		}else{
			
			System.out.println("you are fail or backlog lg gyi");
			
		}
		
		

	}

}

package Lec_11;
import java.util.Scanner;

public class Data_Types_1_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	byte b= (byte)(300);  //44
	//	byte b= (byte)(364);
		byte b= (byte)(428);
		byte b1=-5;
		Short s=7;
		int i=78;
	//	long l=99;
		long l=10000000000l;
		//i=b;
		b= (byte)(i);
		
		System.out.println(b);
		
		b=12;
		b=(byte) (b+5);
		b+=5;  //b=(byte) (b+5);
		
//		Scanner sc=new Scanner(System.in);
//        i=sc.nextInt();
//        b=sc.nextByte();
//        s=sc.nextShort();
//        l=sc.nextLong();
		
		
	}

}

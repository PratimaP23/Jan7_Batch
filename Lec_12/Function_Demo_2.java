package Lec_12;

public class Function_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Coding Blocks");

		int a=4;
		int b=11;
		Add(a,b);
		//System.out.println(Add(a,b));
		int ans = Add(a,b);
		System.out.println(ans);
		System.out.println("Bye");
	}

	public static int Add(int a,int b) {

		int c = a + b;
		c=c+sub(b,c);
        return c;
	}
	
	public static int sub(int a,int b) {

		int c = a - b;
        return c;
	}

}

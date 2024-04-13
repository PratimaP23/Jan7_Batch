package Lec_13;

public class Swap_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {3,2,5,6,7};
		
		System.out.println(arr[0]+" "+arr[1]);
		
		Swap(arr,0,1);

		System.out.println(arr[0]+" "+arr[1]);
	}
	
	public static void Swap(int [] arr,int i,int j) {
		
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}

}

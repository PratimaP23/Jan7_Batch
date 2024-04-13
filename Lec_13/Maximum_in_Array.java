package Lec_13;

public class Maximum_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,5,1,7,8,6};
		
		System.out.println(max(arr));

	}
	
	//method 2 for this ques to solve
	
	public static int max(int[] arr) {

		int m = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			m=Math.max(m, arr[i]);
			
		}
		return m;
}
}
		
		//method 1 for this ques to solve

//	public static int max(int [] arr) {
//		
//		int m=arr[0];
//		
//		for(int i=1;i<arr.length;i++) {		
//		
//			if(arr[i]>m) {
//				
//				m=arr[i];
//			}
//	}
//		return m;
//}
//}

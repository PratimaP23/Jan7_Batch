package Lec_15;

public class Maximum_Sum_SubArray_Kadens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        
		 System.out.println(MaximumSubArraysum(arr));
		 
	}

	public static int MaximumSubArraysum(int[] arr) {

		int ans=Integer.MIN_VALUE;
		int sum =0;
		int p = 0;
		int q = 0;
		int x = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (ans < sum) {

				p = x;
				q = i;
				ans = sum;

			}
			
			if(sum<0) {
				
				sum=0;
				x=i+1;
			}
		}


		for (int i = p; i <= q; i++) {

			System.out.print(arr[i] + " ");
			

		}
		System.out.println();
         return ans;
	}

}

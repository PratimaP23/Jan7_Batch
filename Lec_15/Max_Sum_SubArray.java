package Lec_15;

public class Max_Sum_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
            
		System.out.println(MaximumSubArraysum(arr));
		
	}
	
	public static int MaximumSubArraysum(int[] arr) {
		
		int ans=Integer.MIN_VALUE;
		int p=0;
		int q=0;
		
		for(int i=0;i<arr.length;i++) {
			
			int sum=0;
			
			for(int j=i;j<arr.length;j++) {
				
				sum+=arr[j];
				
				if(ans<sum) {
					
					p=i;
					q=j;
					
					ans=sum;
				}
			}
			
		}
		
		for(int i=p;i<=q;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println();
		
		return ans;
			
	}

}

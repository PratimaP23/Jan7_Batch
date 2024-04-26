package Lec_15;

public class Kadens_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        
		System.out.println(MaximumSubArraysum(arr));
		
	}
	
	public static int MaximumSubArraysum(int[] arr) {
		
		int ans=2;
		int sum=2;
		int p=0;
		int q=0;
		int x=0;
		
		for(int i=0;i<arr.length;i++) {
		    
		    sum+=arr[i];
		    ans=Math.max(ans,sum);
		    
		    if(sum<0) {
		    	
		    	sum=0;
		    }

	    }
		
         return ans;

	}
}

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long prod = 1, c=0;
        for(int i=0;i<n;i++) {
            
            if(nums[i] == 0) {
                c++;
                //continue;
            }
            else prod *= nums[i];
        }
        
        long ans[] = new long[n];
        
        for(int i=0;i<n;i++) {
            
            if(nums[i] == 0 && c==1) ans[i] = prod;
            
            else if(c==0) ans[i] = prod/nums[i];
            
            else ans[i] = 0;
        }
        
        return ans;
	} 
} 

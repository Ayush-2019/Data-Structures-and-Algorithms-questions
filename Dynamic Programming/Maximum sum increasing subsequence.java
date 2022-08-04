class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int dp[] = new int[n];
	    dp[0] = arr[0];
	    
	    int ans = 0;
	    
	    for(int i=0;i<n;i++){
	        int res = 0;
	        for(int j=0;j<i;j++){
	            if(arr[j]<arr[i]) res = Math.max(res, dp[j]);
	        }
	        
	        dp[i] = res + arr[i];
	        ans = Math.max(ans, dp[i]);
	    }
	    return ans;
	}  
}

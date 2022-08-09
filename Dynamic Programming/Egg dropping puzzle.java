class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int solve(int dp[][], int n, int f) 
	{
	    // Your code here
	    if(n == 0) return 0;
	    
	    if(n == 1) return f;
	    
	    if(f==0 || f==1) return f;
	    
	    if(dp[n][f] != -1) return dp[n][f];
	    int ans = Integer.MAX_VALUE;
	    
	    for(int k=1;k<=f;k++){
	        
	        int will_break = solve(dp, n-1, k-1);
	        int not_break = solve(dp, n, f-k);
	        
	        ans = Math.min(ans, 1+Math.max(will_break, not_break));
	    }
	   
	    return dp[n][f] = ans;
	}
    
    
    
    static int eggDrop(int n, int f) 
	{
	    // Your code here
	    int dp[][] = new int[n+1][f+1];
	    
	    for(int i=0;i<=n;i++) Arrays.fill(dp[i], -1);
	    
	    return solve(dp, n, f);
	}
}

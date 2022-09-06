class Solution
{
    
    public int solve(int W, int wt, int val[], int n,int dp[][]){
        
        if(n==0 && W==0) return 0;
        
        if(n==0) return 1000000000;
        if(W==0) return 0;
        
        
        
        if(dp[n][W]!=-1) return dp[n][W];
        
        if(wt<=W && val[n-1] != -1) return dp[n][W] = Math.min(val[n-1]+solve(W-wt,wt,val,n,dp),solve(W,wt-1,val,n-1,dp));
        
        
        else return dp[n][W] = solve(W,wt-1,val,n-1,dp);
        
        
    }
    
	public int minimumCost(int cost[], int n,int w)
	{
		// Your code goes here
		int dp[][] = new int[n+1][w+1];
		
		for(int i=0;i<=n;i++) {
		    Arrays.fill(dp[i], -1);
		    //if(i<n && cost[i] == -1) cost[i] = Integer.MAX_VALUE;
		}
		
		int res = solve(w, n, cost, n, dp);
		
		    if(res>=1000000000) return -1;
		
		 return (res);
		 
		 
	}
}

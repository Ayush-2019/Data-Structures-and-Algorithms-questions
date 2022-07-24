class Solution{
    
    static int solve(int n,int r,int mod,int dp[][]){
        
        if(r==0) return dp[n][r] = 1;
        
        if(n==0) return dp[n][r] = 0;
        
        if(dp[n][r]!=-1) return dp[n][r];
        
        int x = solve(n-1,r-1,mod,dp)%mod;
        int y = solve(n-1,r,mod,dp)%mod;
        
        return dp[n][r] = (x+y)%mod;
       
    }
    static int nCr(int n, int r)
    {
        // code here
        int dp[][] = new int[n+2][r+2];
        
        for(int i=0;i<=n+1;i++){
            for(int j=0;j<=r+1;j++){
                dp[i][j]=-1;
            }
        }
        int mod = 1000000007;
        return solve(n,r,mod,dp);
        
    }
}

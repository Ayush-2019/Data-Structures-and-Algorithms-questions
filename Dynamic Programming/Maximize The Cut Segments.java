class Solution
{
    //Function to find the maximum number of cuts.
    
    
    public int solve(int dp[], int n, int x, int y, int z){
        
        if(n==0){
            return 0;
        }
        
        if(n<0) return Integer.MIN_VALUE;
        if(dp[n]!=-1) return dp[n];
        
        return dp[n] = 1 + Math.max(Math.max(solve(dp, n-x, x, y, z), solve(dp, n-y, x, y, z)), solve(dp, n-z, x, y, z));
    }
    
    
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
       int dp[] = new int[n+1];
       Arrays.fill(dp, -1);
       
       solve(dp, n, x, y, z);
       return dp[n]>0?dp[n]:0;
    }
}

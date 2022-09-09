class Solution
{
    
    int mod = 1000000007;
    
    long solve(int i,int j,String s1,long dp[][]){
        
        if(i>j) return 0;
        
        if(i==j) return 1;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(s1.charAt(i)==s1.charAt(j)) return dp[i][j] =  (1+solve(i,j-1,s1,dp)%mod + solve(i+1, j, s1, dp)%mod + mod)%mod;
        
        else return dp[i][j] = (solve(i,j-1,s1,dp)%mod+solve(i+1,j,s1,dp)%mod - solve(i+1, j-1, s1, dp)%mod + mod)%mod;
        
        
    }
    
    long countPS(String S)
    {
        // Your code here
         int n = S.length();
         
         long dp[][] = new long[n+1][n+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
        
        return solve(0,n-1,S,dp)%mod;
    }
}

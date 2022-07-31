class Solution
{
    
    public long solve(long dp[], int n){
        
        if(n<=0) return 1;
        
        if(dp[n]!=-1) return dp[n];
       
       return dp[n] = (solve(dp, n-1)%1000000007 + ((n-1) * solve(dp, n-2)%1000000007))%1000000007;
    }
    
    public long countFriendsPairings(int n) 
    { 
       //code here
       long dp[] = new long[n+1];
       
       Arrays.fill(dp, -1);
       solve(dp,n);
       
       return dp[n];
       
    }
}    
 

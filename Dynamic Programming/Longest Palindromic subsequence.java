class Solution
{
    
    static int solve(int x,int y,String s1,String s2,int dp[][]){
        
        if(x==0||y==0) return 0;
        
        if(dp[x][y]!=-1) return dp[x][y];
        
        if(s1.charAt(x-1)==s2.charAt(y-1)) return dp[x][y] = 1+solve(x-1,y-1,s1,s2,dp);
        
        else return dp[x][y] = Math.max(solve(x,y-1,s1,s2,dp),solve(x-1,y,s1,s2,dp));
        
        
    }
    
    public int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length();
         String rev = "";
         for(int i=n-1;i>=0;i--) rev += S.charAt(i);
         
        int dp[][] = new int[n+1][n+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
        
        return solve(n,n,S,rev,dp);
    }
}

class Solution{
  
  
  
  //tabulation with dp of size w+1 * 2
  
  static int solve_Tab(int n, int w, int val[], int wt[]){
    
        int dp[][] = new int[2][w+1];
        
        
        for(int j=0;j<=w;j++) dp[0][j] = (int)(j/wt[0]) * val[0];
        int bit = 0;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=w;j++){
                bit = i & 1;
                if(wt[i-1]<=j){
                
                dp[bit][j] = Math.max(val[i-1]+dp[bit][j-wt[i-1]],dp[1-bit][j]);
            }
            
            else dp[bit][j] = dp[1-bit][j];
                    
            }
        }
        
        
        
        return dp[bit][w];
    
  }
        //Memoization approach
        static int solveMem(int W, int wt[], int val[], int n,int dp[][]){
        //fundamental code
        if(n==0 || W==0)
        return 0;
        
        if(dp[n][W]!=-1)
        return dp[n][W];
        
        if(wt[n-1]<=W){
            
            return dp[n][W] = Math.max(val[n-1]+solve(W-wt[n-1],wt,val,n,dp),solve(W,wt,val,n-1,dp));
        }
        
        else if(wt[n-1]>W) return dp[n][W] = solve(W,wt,val,n-1,dp);
        
        return -1;
        
    }
  
    //Space Optimized to 1Darray
  
    static int solveOp(int n, int w, int val[], int wt[]){
      int dp[] = new int[w+1];
        
        
        for(int j=0;j<=w;j++) dp[j] = (int)(j/wt[0]) * val[0];
        
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=w;j++){
               
                if(wt[i-1]<=j){
                
                dp[j] = Math.max(val[i-1]+dp[j-wt[i-1]],dp[j]);
            }
            
                    
            }
        }
        
        
        
        return dp[w];
    }
  
  
    static int knapSack(int n, int w, int val[], int wt[])
    {
        // code here
        
        int dp[][] = new int[n+1][w+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                dp[i][j] = -1;
            }
        }
        
        return solve(w,wt,val,n,dp);
      
    }
}

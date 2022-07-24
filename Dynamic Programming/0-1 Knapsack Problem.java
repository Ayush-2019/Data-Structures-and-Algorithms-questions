class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    
    static int solve(int W, int wt[], int val[], int n,int dp[][]){
        //fundamental code
        if(n==0 || W==0)
        return 0;
        
        if(dp[n][W]!=-1)
        return dp[n][W];
        
        if(wt[n-1]<=W){
            
            return dp[n][W] = Math.max(val[n-1]+solve(W-wt[n-1],wt,val,n-1,dp),solve(W,wt,val,n-1,dp));
        }
        
        else if(wt[n-1]>W) return dp[n][W] = solve(W,wt,val,n-1,dp);
        
        return 0;
        
    }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         int dp[][] = new int[n+1][W+1];
         
         for(int i=0;i<n+1;i++){
             for(int j=0;j<W+1;j++){
                 dp[i][j]=-1;
             }
         }
         
         return solve(W,wt,val,n,dp);
         
         
    } 
}



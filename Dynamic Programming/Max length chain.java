class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}

class GfG
{
    
    int solve(Pair arr[], int dp[][], int n, int curr, int prev){
        
        if(curr == n) return 0;
        if(dp[curr][prev+1] != -1) return dp[curr][prev+1];
        
        int inc = 0;
        if(prev == -1 || arr[prev].y < arr[curr].x) inc = 1 + solve(arr,dp, n, curr+1, curr);
        
        int exc = solve(arr,dp, n, curr+1, prev);
        
        return dp[curr][prev+1] = Math.max(inc, exc);
    }
    
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       
       Comparator<Pair>com=new CompareByFirst();
       Arrays.sort(arr,com);
       
       int dp[][] = new int[n][n+1];
       for(int i=0;i<n;i++) Arrays.fill(dp[i], -1);
       
       return solve(arr, dp, n, 0, -1);
    }
}

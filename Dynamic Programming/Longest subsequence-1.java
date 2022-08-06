class Solution{
    
    static int solve(int arr[], int dp[][], int n, int curr, int prev){
        if(curr == n) return 0;
        
        if(dp[curr][prev+1]!=-1) return dp[curr][prev+1];
        
        int include = 0;
        if(prev == -1 || Math.abs(arr[curr]-arr[prev]) == 1) include = 1 + solve(arr, dp, n, curr+1, curr);
        
        int exclude = solve(arr, dp, n, curr+1, prev);
        
        return dp[curr][prev+1] = Math.max(include, exclude);
    }
    
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        int dp[][] = new int[n][n+1];
        
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i], -1);
        
        return solve(arr, dp, n, 0, -1);
    }
}

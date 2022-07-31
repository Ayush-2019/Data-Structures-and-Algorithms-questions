class Solution{
    
    static int solve(int arr[], int dp[][], int l, int r){
        if(l==r) return 0;
        
        if(dp[l][r]!=-1) return dp[l][r];
        
        dp[l][r] = Integer.MAX_VALUE;
        for(int k=l;k<r;k++){
            int left = solve(arr, dp, l, k);
            int right = solve(arr, dp, k+1, r);
            dp[l][r] = Math.min(dp[l][r], left+right+(arr[l-1]*arr[k]*arr[r]));
        }
        
        return dp[l][r];
    }
    
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        if(N==2) return 0;
        int dp[][] = new int[N][N];
        
        for(int i=0;i<N;i++) Arrays.fill(dp[i],-1);
        
        solve(arr, dp, 1, N-1);
        
        return dp[1][N-1];
    }
}

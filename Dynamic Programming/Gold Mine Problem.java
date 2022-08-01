class Solution{
    
    static int solve(int M[][], int dp[][], int row, int col, int n, int m){
        
        if(row<0 || row==n || col==m) return 0;
        
        if(dp[row][col] != -1) return dp[row][col];
        
        int right = solve(M, dp, row, col+1, n, m);
        int dig_up = solve(M, dp, row-1, col+1, n, m);
        int dig_down = solve(M, dp, row+1, col+1, n, m);
        
        int ans = M[row][col] + Math.max(Math.max(dig_up, dig_down), right);
        
        return dp[row][col] = ans;
        
    }
    
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int dp[][] = new int[n][m];
        
        for(int i=0;i<n;i++) Arrays.fill(dp[i], -1);
        
        int max_gold = 0;
        for(int i=0;i<n;i++){
        solve(M, dp, i, 0, n, m);
        max_gold = Math.max(max_gold, dp[i][0]);
        }
        
        return max_gold;
    }
}

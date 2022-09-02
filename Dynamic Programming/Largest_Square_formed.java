class Solution{
    
    static int max_sq = 0;
    
    static int solve_rec(int mat[][], int row, int col){
        
        if(row>=mat.length || col>=mat[0].length) return 0;
        
        int diagonal = solve(mat, row+1, col+1);
        int right = solve(mat, row, col+1);
        int down = solve(mat, row+1, col);
        
        if(mat[row][col] == 1){
            
            int ans = 1 + Math.min(diagonal, Math.min(right, down));
            //max_sq = Math.max(max_sq, ans);
            return ans;
        }
        else{
          return 0; 
        }
    }
    
    static int solve_mem(int mat[][], int row, int col, int dp[][]){
        
        if(row>=mat.length || col>=mat[0].length) return 0;
        
        if(dp[row][col] != -1) return dp[row][col];
        
         int diagonal = solve(mat, row+1, col+1, dp);
         int right = solve(mat, row, col+1, dp);
         int down = solve(mat, row+1, col, dp);
        
        if(mat[row][col] == 1){
            
            dp[row][col]  = 1 + Math.min(diagonal, Math.min(right, down));
            max_sq = Math.max(max_sq, dp[row][col]);
            return dp[row][col];
        }
        else{
          return dp[row][col] = 0; 
        }
    }
    
    static void solve_tab(int mat[][], int row, int col, int dp[][]){
        
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                
                int diagonal = dp[i+1][j+1];
                int right = dp[i][j+1];
                int down = dp[i+1][j];
                
                if(mat[i][j] == 1){
                
                    dp[i][j]  = 1 + Math.min(diagonal, Math.min(right, down));
                    max_sq = Math.max(max_sq, dp[i][j]);
            }
        }
        
         
        }
        
    }
    
    static int maxSquare(int n, int m, int mat[][]){
        // code here
        
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++) Arrays.fill(dp[i], 0);
        
        solve_tab(mat, n, m, dp);
        
        int temp = max_sq;
        max_sq = 0;
        
        return temp;
        
    }
}

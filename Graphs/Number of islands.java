class Solution {
    // Function to find the number of islands.
    void dfs(int n, int m,int i, int j, char[][] grid, int[][] vis, int row[], int col[]){
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j]!=0 || grid[i][j]=='0') return;
        
        vis[i][j]++;
        
        for(int k=0;k<8;k++) dfs(n,m,i+row[k],j+col[k],grid,vis, row, col);
        
    }
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] vis = new int[n][m];
        
        int c=0;
        
        int row[] = {1,-1,0,0,1,-1,1,-1};
        int col[] = {0,0,1,-1,1,-1,-1,1};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    c++;
                    dfs(n,m,i,j,grid,vis, row, col);
                }
            }
        }
        
        return c;
    }
}

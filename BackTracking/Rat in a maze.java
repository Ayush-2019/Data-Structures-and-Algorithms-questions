class Solution {
    public static void dfs(int[][] m,int i,int j,int[][] vis, String s,int n,ArrayList<String> ans){
        if(i<0 || j<0 || i>=n || j>=n) return;
        
        if(m[i][j]==0 || vis[i][j]==1) return;
        
        if(i==n-1 && j==n-1){
            
         ans.add(s);
         return;
        }
        
        vis[i][j] = 1;
        
        dfs(m,i,j+1,vis, s+"R",n,ans);
        dfs(m,i,j-1,vis,s+"L",n,ans);
        dfs(m,i+1,j,vis,s+"D",n,ans);
        dfs(m,i-1,j,vis,s+"U",n,ans);
        
        vis[i][j]=0;
        
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<String>();
        int[][] vis = new int[n][n];
        
        if(m[0][0]==0) return ans;
        if(m[n-1][n-1] == 0) return ans;
        String s = "";
        
        dfs(m,0,0,vis,s,n,ans);
        Collections.sort(ans);
        return ans;
    }
}

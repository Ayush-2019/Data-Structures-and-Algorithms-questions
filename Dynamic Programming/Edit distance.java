class Solution {
    int solve(int x,int y,String s,String t,int dp[][]){
        //if reached till end by insertion or removal, add the rest of the string, as that should be either inserted or removed
        if(x == -1) return y+1;
        if(y == -1) return x+1;
        
        if(dp[x][y]!=-1) return dp[x][y];
        
        if(s.charAt(x) == t.charAt(y)) return dp[x][y] = solve(x-1,y-1,s,t,dp);
        
        int a = solve(x-1,y-1,s,t,dp); //for replacement
        int b = solve(x,y-1,s,t,dp); // for insertion
        int c = solve(x-1,y,s,t,dp); //for removal
        
        return dp[x][y] = 1 + Math.min(a,Math.min(b,c));
    }
    public int editDistance(String s, String t) {
        // Code here
        int x = s.length(), y = t.length();
        
        int dp[][] = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                dp[i][j] = -1;
            }
        }
        
        return solve(x-1,y-1,s,t,dp);
    }
}

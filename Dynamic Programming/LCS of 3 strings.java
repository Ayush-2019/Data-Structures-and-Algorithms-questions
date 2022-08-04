class Solution 
{ 
    
    static int solve(int x,int y,int z,String s1,String s2,String s3, int dp[][][]){
        
        if(x==0||y==0||z==0) return 0;
        
        if(dp[x][y][z]!=-1) return dp[x][y][z];
        
        if(s1.charAt(x-1)==s2.charAt(y-1) && s1.charAt(x-1) == s3.charAt(z-1)) return dp[x][y][z] = 1+solve(x-1,y-1,z-1,s1,s2,s3,dp);
        
        else return dp[x][y][z] = Math.max(
            Math.max(
                Math.max(
                    Math.max(
                        Math.max(solve(x,y-1,z,s1,s2,s3,dp),solve(x-1,y,z,s1,s2,s3,dp)),
            solve(x,y,z-1,s1,s2,s3,dp)),
            solve(x-1,y-1,z,s1,s2,s3,dp)),
            solve(x,y-1,z-1,s1,s2,s3,dp)),
            solve(x-1,y,z-1,s1,s2,s3,dp)
            );
        
        
    }
    
    int LCSof3(String s1, String s2, String s3, int x, int y, int z) 
    { 
        // code here
        int dp[][][] = new int[x+1][y+1][z+1];
        
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                for(int k=0;k<z+1;k++){
                dp[i][j][k] = -1;
            }
        }
        
    }
        
        
        return solve(x,y,z,s1,s2,s3,dp);
        
    }
} 

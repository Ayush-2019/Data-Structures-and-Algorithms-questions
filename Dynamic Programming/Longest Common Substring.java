class Solution{
    int longestCommonSubstr(String s1, String s2, int n, int m){
        // code here
        int dp[][] = new int[n+1][m+1];
        
        int res = 0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                
                else{
                    dp[i][j] = 0;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        
        return res;
    }
}

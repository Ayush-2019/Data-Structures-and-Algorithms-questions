class Solution {
  
    static long solve_eff(int h){
        if(h<=1) return 1;
        
        long dp0 = 1, dp1 = 1,dp2 = 3;
       
        for(int i = 2; i <= h; i++) {
     
              dp2 = (dp1 * ((2 * dp0)%1000000007 + dp1)%1000000007) % 1000000007;
          
            dp0 = dp1;
              dp1 = dp2;
        }
        return dp2;
    }
    
    static long solve(int h, long dp[]){
        
        if (h == 0 || h == 1) return 1;
        
        if(dp[h]!= -1) return dp[h];
        
        return dp[h] = (solve(h-1, dp) * ((2 *solve(h-2, dp))%1000000007 +
                              solve(h-1, dp)%1000000007))%1000000007;
        
    }
    
    static long countBT(int h){
        // code here
        long dp[] = new long[h+1];
        
        Arrays.fill(dp, -1);
        
        return solve(h, dp);
        
        
    }
}

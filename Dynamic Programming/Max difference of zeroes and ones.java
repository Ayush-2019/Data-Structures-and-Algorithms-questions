class Solution {
    int maxSubstring(String S) {
        // code here
        int dp[] = new int[S.length()];
        
        boolean all_one = true;
        if(S.charAt(0) == '1') dp[0] = 0;
        else{
            dp[0] = 1;
            all_one = false;
        }
        int res = dp[0];
        
        for(int i=1;i<S.length();i++){
            
            if(S.charAt(i) == '0') {
                dp[i] = 1 + dp[i-1];
                all_one = false;
            }
            
            else dp[i] = Math.max(0, dp[i-1] - 1);
            
            res = Math.max(res, dp[i]);
        }
        
        return all_one == true ? -1 : res;
    }
}

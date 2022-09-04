class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int n, int k) 
    {
        // Your code goes here 
        int dp[] = new int[n];
        dp[0] = 0;
        
        Arrays.sort(arr);
        
        for(int i=1;i<n;i++){
            
            dp[i] = dp[i-1];
            
            if((arr[i] - arr[i-1]) < k){
                
                if(i>=2) dp[i] = Math.max(dp[i], dp[i-2] + arr[i] + arr[i-1]);
                
                else dp[i] = Math.max(dp[i], arr[i] + arr[i-1]);
            }
        }
        
        return dp[n-1];
    }
    
}

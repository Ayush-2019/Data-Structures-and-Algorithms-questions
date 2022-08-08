class Solution {
    
    // Function for memoization approach
     int solve(int arr[], int dp[], int n, int curr){
        if(curr >= n) return 0;
        
        if(dp[curr]!=-1) return dp[curr];
        
        int include = arr[curr] + solve(arr, dp, n, curr+2);
        
        int exclude = solve(arr, dp, n, curr+1);
        
        return dp[curr] = Math.max(include, exclude);
    }
    
    int findMaxSum(int arr[], int n) {
        // code here
        //Code for memoization approach
        /*int dp[] = new int[n];
        
        Arrays.fill(dp, -1);
        
        return solve(arr, dp, n, 0);*/
        
        //Code for space optimized approach
        if(n == 1) return arr[0];
        int val1 = arr[0], val2 = 0, max_val = 0;
        
        for(int i=1;i<n;i++){
            
            int include = val2 + arr[i], exclude = val1;
            max_val = Math.max(include, exclude);
            
            val2 = val1;
            val1 = max_val;
            
        }
        
        return max_val;
    }
}

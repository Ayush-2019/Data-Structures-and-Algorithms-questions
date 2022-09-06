class Solution {
    
    int solve(int arr[], int n, int k, int low, int high, int dp[][]){
        
        if(low>=high) return 0;
        
        if(dp[low][high] !=-1) return dp[low][high];
        
        if(arr[high] - arr[low] > k)
        return dp[low][high] = 1 + Math.min(solve(arr, n, k, low+1, high, dp), solve(arr, n, k, low, high-1, dp));
        
        return 0;
    }
    
    int removals(int[] arr, int n, int k) {
        // code here
        int dp[][]= new int[n][n];
        
        for(int i=0;i<n;i++) Arrays.fill(dp[i], -1);
        
        Arrays.sort(arr);
        
        
        return solve(arr, n, k, 0, n-1, dp);
    }
}

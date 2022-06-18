class Solution
{
    //Function to find the maximum money the thief can get.
    
    public int solve(int arr[], int dp[], int i){
        if(i<=-1) return 0;
        
        if(dp[i] != -1) return dp[i];
        
        return dp[i] = Math.max(arr[i] + solve(arr,dp,i-2), solve(arr,dp,i-1));
    }
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int dp[] = new int[n];
        
        Arrays.fill(dp,-1);
        
        return solve(arr,dp,n-1);
    }
}

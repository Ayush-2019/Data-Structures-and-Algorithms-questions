class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        int dp[] = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = Integer.MIN_VALUE;
        
        for(int i=0; i<n;i++){
            int num = arr[i], j=0;
            
            while(num>dp[j]) j++;
            
            dp[j] = num;
        }
        
        for(int i=n;i>=0;i--) if(dp[i] != Integer.MAX_VALUE) return i;
        
        return 0;
    }
} 

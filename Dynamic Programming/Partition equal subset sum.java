class Solution{
    static int solve(int arr[],int n, int sum, int dp[][]){
        if(n==-1){
            if(sum==0)
            return 1;
            
            return 0;
        }
        
        
        if(sum<0)
        return 0;
        
        if(sum==0)
        return 1;
        
        if(dp[n][sum]!=-1)
        return dp[n][sum];
        
        return dp[n][sum] =  solve(arr,n-1,sum-arr[n],dp) | solve(arr,n-1,sum,dp);
    }
    static int equalPartition(int n, int arr[])
    {
        // code here
        int sum=0;
        
        for(int a:arr){
            sum+=a;
        }
        
        if(sum%2!=0)
        return 0;
        
        sum=sum/2;
        
        
        
        int dp[][] = new int[n][sum+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j] = -1;
            }
        }
        
        return solve(arr,n-1,sum,dp);
        
    }
}

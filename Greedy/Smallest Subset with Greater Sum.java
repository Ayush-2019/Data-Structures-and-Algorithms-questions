class Solution { 
    int minSubset(int[] arr,int n) { 
        
        Arrays.sort(arr);
        
        long sum = 0, ans = 0, new_sum = 0;
        for(int i=0;i<n;i++) sum += arr[i];
        
        for(int i=n-1;i>=0;i--){
            ans++;
            new_sum += arr[i];
            if(new_sum > sum - new_sum){
                return (int)ans;
            }
        }
        
        return (int)ans;
    }
}

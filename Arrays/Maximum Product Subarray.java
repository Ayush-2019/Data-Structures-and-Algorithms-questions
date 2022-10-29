class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        
        long maxi = 1, mini = 1;
        long ans = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]<0){
            long temp = maxi;
            maxi = mini;
            mini = temp;
            }
            
            maxi = Math.max(arr[i],maxi*arr[i]);
            mini = Math.min(arr[i],mini*arr[i]);
            
            ans = Math.max(ans, maxi);
        }
        return ans;
    }
}

class Solution {

    public static int smallestSubWithSum(int arr[], int n, int x) {
        // Your code goes here 
        int i=0;
        
        int sum=arr[i], ans = Integer.MAX_VALUE;
        
        if(sum>x) return 1;

        for(int j=1;j<n;j++){
            
            sum += arr[j];
            
            while(sum-arr[i] > x && i<=j) {
                sum -= arr[i];
                i++;
            }
            if(sum>x) ans = Math.min(ans, j-i+1);
            
        }
        
        return ans!=Integer.MAX_VALUE?ans : 0;
    }
}


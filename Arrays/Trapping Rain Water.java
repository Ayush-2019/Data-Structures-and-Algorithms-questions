class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        int left[] = new int[n];
        left[0] = arr[0];
        
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        
        for(int i=1;i<n;i++){
            if(arr[i]>=left[i-1]){
                left[i] = arr[i];
            }
            else{
                left[i] = left[i-1];
            }
        }
        
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= right[i+1]){
                right[i] = arr[i];
            }
            else{
                right[i] = right[i+1];
            }
        }
        
        long ans = 0;
        
        for(int i=0;i<n;i++){
            ans += Math.min(left[i], right[i]) - arr[i];
        }
        
        return ans;
    } 
}



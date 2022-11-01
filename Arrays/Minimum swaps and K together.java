class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        
        int count = 0, to_swap = 0;
        
        for(int i=0;i<n;i++) if(arr[i]<=k) count++;
        
        if(count == 1) return 0;
        
        for(int i=0;i<count;i++){
            if(arr[i] > k) to_swap++;
        }
        
        int ans = to_swap;
        
        for(int i=count;i<n;i++){
            
            if(arr[i] > k) to_swap++;
           
            if(arr[i-count] > k) to_swap--;
           
            
            ans = Math.min(ans, to_swap);
        }
        
        return ans;
    }
}

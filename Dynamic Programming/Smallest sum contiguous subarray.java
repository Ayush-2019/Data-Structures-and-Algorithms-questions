class Solution
{
    static int smallestSumSubarray(int arr[], int n)
    {
        // your code here
        int min_here = 0, min_total = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            min_here += arr[i];
            
            min_total = Math.min(min_total, min_here);
            
            if(min_here>0) min_here = 0;
            
            
        }
        return min_total;
    }
}

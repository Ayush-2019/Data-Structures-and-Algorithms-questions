class Solution {

    public static long maximizeSum(long arr[], int n, int k)
    {
        // Your code goes here 
        Arrays.sort(arr);
        
        long sum = 0, min_elem = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            long curr = arr[i];
            
            if(curr<0 && k>0){
                arr[i] = Math.abs(curr);
                k--;
            }
            
            sum += arr[i];
            min_elem = Math.min(min_elem, arr[i]);
            }
            

        
        if(k>0 && k%2 !=0) sum -= (2*min_elem);
        
        
        return sum;
    }
}

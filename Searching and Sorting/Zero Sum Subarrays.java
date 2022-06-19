class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        HashMap<Long, Long> map = new HashMap<>();
        
        long count = 0, curr_sum = 0;
        
        for(int i=0;i<n;i++){
            curr_sum+=arr[i];
            if(curr_sum == 0) count++;
            
            if(map.containsKey(curr_sum-0) == true) {
                count+=map.get(curr_sum);
                map.put(curr_sum,map.get(curr_sum)+1);
            }
            
           // long increase = map.get(curr_sum)+1;
            else map.put(curr_sum,(long)1);
        }
        
        return count;
    }
}

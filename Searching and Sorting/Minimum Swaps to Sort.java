class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        
        int n = nums.length;
        int B[] = new int[n];
        
        HashMap<Integer, Integer>map = new HashMap<>();
        
        for(int i=0;i<n;i++) {
            B[i] = nums[i];
            map.put(nums[i], i);
        }
        
        Arrays.sort(B);
        
        int ans = 0;
        
        for(int i=0;i<n;i++){
            int ind = map.get(B[i]);
            
            if(nums[i] != B[i]){
                ans++;
                
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                
                map.put(nums[i], i);
                map.put(nums[ind], ind);
            }
        }
        return ans;
    }
}

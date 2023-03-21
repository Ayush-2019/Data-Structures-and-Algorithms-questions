class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        
        int xor = 0;
        
        for(int val : nums){
            xor ^= val;
        }
        
        int rmsb = xor & -xor;
        
        int ans[] = new int[2];
        
        for(int val : nums){
            if((val & rmsb) == 0){
                ans[0] ^= val;
            }
            else{
                ans[1] ^= val;
            }
        }
        
        Arrays.sort(ans);
        
        return ans;
    }
}

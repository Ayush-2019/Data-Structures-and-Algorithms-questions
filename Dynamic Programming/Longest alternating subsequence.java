class Solution
{
    public int AlternatingaMaxLength(int[] nums)
    {
        // code here
        int ma = 1 , mi = 1, n = nums.length;
        if(n == 1) return 1;
        
        
        
        for(int i=1;i<n;i++){
            
            if(nums[i] > nums[i-1]) ma = mi+1;
            
            else if(nums[i] < nums[i-1]) mi = ma+1;
        }
        
        return Math.max(ma, mi);
        
    }
    
    
}

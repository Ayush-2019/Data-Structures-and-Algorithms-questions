class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        if(n == 0) return false;
        
        // Your code here
        long rmsb = n & -n;
        
        return n == rmsb;
        
    }
    
}

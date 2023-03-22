class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    
    //alternate approach for getting x
    
    // public static int powerLessOrEqualToN(int n){
        
    //     int x = 0;
        
    //     while((1<<x) <= n) x++;
        
    //     return x-1;
    // }
    
    public static int countSetBits(int n){
        
        if(n == 0) return 0;
    
        // Your code here
        
        // int x = powerLessOrEqualToN(n);
        
        int x = (int)Math.floor(Math.log(n)/Math.log(2));
        
        return (1<<x-1)*x + (n - (1<<x) + 1) + countSetBits(n-(1<<x));
        
    }
}

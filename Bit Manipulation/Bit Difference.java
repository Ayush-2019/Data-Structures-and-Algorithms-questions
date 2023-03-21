class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    
    static int setBits(int N) {
        // code here
        
        int ans = 0, num = N;
        
        while(num>0){
            
            ans += num & 1;
            
            num >>= 1;
        }
        
        return ans;
    }
    
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        
        int xor = a^b;
        
        return setBits(xor);
        
    }
    
    
}

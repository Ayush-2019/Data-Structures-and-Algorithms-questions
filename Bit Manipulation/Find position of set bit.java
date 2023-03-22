class Solution {
    static int findPosition(int n) {
        // code here
        
        if(n == 0) return -1;
        
        // Your code here
        long rmsb = n & -n;
        
         if(n == rmsb){
             
             int ans = 0;
             
             while(n>0) {
                 
                 ans++;
                 n >>= 1;
             }
             
             return ans;
             
         }
         
         return -1;
    }
};

class Solution {
    static int setBits(int N) {
        // code here
        
        int ans = 0, num = N;
        
        while(num>0){
            
            ans += num & 1;
            
            num >>= 1;
        }
        
        return ans;
    }
}

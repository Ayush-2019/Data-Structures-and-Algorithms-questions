class Solution{
  
  // Approach for T.C. = O(1) & S.C. = O(1)
    static int setSetBit(int x, int y, int l, int r){
        // code here
        
        if (l < 1 || r > 32)
        return x;
        
        int mask = (int)(1L<<(r-l+1));
        mask--;
        mask = mask<<(l-1) & y;
        
        
        return x | mask;
        
    }
}

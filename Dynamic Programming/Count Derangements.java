class Solution{
    
    static long disarrange(int n){
        // code here
        
        if(n==1) return 0;
        if(n==2) return 1;
        
        long first = 0, second = 1, next = 2;
        
        for(int i = 3;i<=n;i++){
            
            next = ((i-1)%1000000007 * (first%1000000007 + second%1000000007)%1000000007);
            
            first = second;
            second = next;
        }
        
        return next;
        
    }
}

class Solution{
    static int minimumDays(int S, int N, int M){
        // code here
        if(M>N) return -1;
        
        int canBuy = S - S/7;
        
        int shouldBuy = (S*M)%N == 0 ? (S*M)/N : ((S*M)/N) + 1;
        
        if(canBuy<shouldBuy) return -1;
        return shouldBuy;
    }
}

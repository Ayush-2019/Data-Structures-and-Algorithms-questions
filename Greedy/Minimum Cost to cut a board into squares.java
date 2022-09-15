class Solution {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        
        int first = X.length-1, second = Y.length-1;
        int hcuts = 1, vcuts = 1;
        int ans = 0;
        
        while(first>=0 && second>=0){
            
            if(X[first] > Y[second]){
                ans += (vcuts * X[first]);
                hcuts++;
                first--;
            }
            else{
                ans += (hcuts * Y[second]);
                vcuts++;
                second--;
            }
        }
        
            while(first>=0){
                ans += (vcuts * X[first]);
                hcuts++;
                first--;
            }
            
            while(second>=0){
                ans += (hcuts * Y[second]);
                vcuts++;
                second--;
            }
        
        return ans;
        
    }
}
        

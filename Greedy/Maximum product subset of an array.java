class Solution {
    public static int findMaxProduct(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
 
        int least = Integer.MIN_VALUE;
        int negc = 0, zc = 0;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            
            int curr = arr[i];
 
            if (curr == 0) {
                zc++;
                continue;
            }
 
            else if (curr < 0) {
                negc++;
                least = Math.max(least, curr);
            }
 
            ans = (ans * curr);
            ans = ans%1000000007;
        }
 
        if (zc == n) {
            return 0;
        }
 
        if (negc % 2 == 1) {
 
            if (negc == 1 && zc == n-1) {
                return 0;
            }
 
            ans = (ans / least);
        }
 
        return (int)ans;
        
    }
}
        

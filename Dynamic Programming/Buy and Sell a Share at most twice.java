class Solution {
    public static int maxProfit(int n, int[] price) {
        // code here
      
      //Approach 1
        
        int profit[] = new int[n];

        int max_price = price[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            
            if (price[i] > max_price)
                max_price = price[i];
 
            profit[i] = Math.max(profit[i + 1],max_price - price[i]);
        }
 
        
        int min_price = price[0];
        for (int i = 1; i < n; i++) {
            
            if (price[i] < min_price)
                min_price = price[i];
 
            profit[i] = Math.max(profit[i - 1],profit[i] + (price[i] - min_price));
        }
        int ans = profit[n - 1];
        return ans;
      
        //Approach 2
        
        int buy1=Integer.MAX_VALUE;
        int buy2=Integer.MAX_VALUE;
        int profit1=0;
        int profit2=0;
        for(int i=0;i<n;i++)
        {
           buy1=Math.min(buy1,price[i]);
           profit1=Math.max(profit1,price[i]-buy1);
           buy2=Math.min(buy2,price[i]-profit1);
           profit2=Math.max(profit2,price[i]-buy2);
        }
        
        return profit2;
    }
}
        

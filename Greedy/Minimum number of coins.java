class Solution{
    static List<Integer> minPartition(int n)
    {
        // code here
        int coins[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        List<Integer> ans = new ArrayList<>();
        
        int amount = n, i = 0;
        
        while(amount>0){
            
            if(coins[i] <= amount){
                ans.add(coins[i]);
                amount -= coins[i];
            }
            
            else i++;
        }
        
        return ans;
        
    }
}

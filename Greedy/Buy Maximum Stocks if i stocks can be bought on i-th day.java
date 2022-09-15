class Pair{
    int day, price;
    
    Pair(int x, int y){
        this.day = x;
        this.price = y;
    }
}

class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        Pair arr[] = new Pair[n];
        
        for(int i=0;i<n;i++) arr[i] = new Pair(i+1, price[i]);
        
        Arrays.sort(arr, (a,b) -> a.price - b.price);
        
        int cash = k, ans = 0;
        
        for(int i=0;i<n;i++){
            
            int chances = arr[i].day;
            
            while(cash>0 && chances>0){
                
                if(arr[i].price <= cash){
                    cash = cash - arr[i].price;
                    chances--;
                    ans++;
                }
                
                else break;
                
                
            }
        }
        
        return ans;
    }
}
        

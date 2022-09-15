class Solution{
    static ArrayList<Integer> candyStore(int candies[],int n,int k){
        // code here
        Arrays.sort(candies);
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int min_price=0,candiesn=n,i=0;
        
        while(candiesn>0){
            min_price += candies[i];
            candiesn-=k+1;
            i++;
        }
        
        ans.add(min_price);

        int max_price=0;
        candiesn=n;
        i=n-1;
        
        while(candiesn>0){
            max_price += candies[i];
            candiesn-=k+1;
            i--;
        }
        
        ans.add(max_price);
        
        return ans;
        
    }
}

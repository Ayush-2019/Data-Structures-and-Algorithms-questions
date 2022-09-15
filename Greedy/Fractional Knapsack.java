class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here b.value/b.weight - a.value-a.weight
        
        Arrays.sort(arr, new Comparator<Item>() {
            public int compare(Item a, Item b)
            {
                double r1 = (double)a.value/(double)a.weight;
                double r2 = (double)b.value/(double)b.weight;
                if(r1<r2){
                    return 1;
                }
                else if(r1>r2){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        
        int limit = W,i=0;
        double ans=0;
        while(limit>0 && i<n){
            
            
            if(arr[i].weight<=limit){
                ans+=arr[i].value;
                limit-=arr[i].weight;
                i++;
            }
            
            else{
                ans+=(arr[i].value*(double)limit)/arr[i].weight;
                limit=0;
                i++;
            }
        }
        return ans;
    }
}

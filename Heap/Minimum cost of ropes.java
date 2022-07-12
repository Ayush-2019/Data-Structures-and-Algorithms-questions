class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        
        if(pq.size() == 1) return 0;
        long ans = 0;
        while(pq.size()>1){
            long first = pq.poll(), second = pq.poll();
            
            long sum = first+second;
            pq.add(sum);
            ans += sum;
        }
        
        return ans;
        
    }
}

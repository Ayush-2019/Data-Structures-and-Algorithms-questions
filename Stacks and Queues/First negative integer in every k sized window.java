class Compute {
    
    public long[] printFirstNegativeInteger(long arr[], int n, int k)
    {
        Queue<Integer>q = new LinkedList<Integer>();
        long ans[] = new long[n-k+1];
        
        for(int i=0;i<k;i++) if(arr[i]<0) q.add(i);
        int c=0;
        for(int i=k;i<n;i++){
            
            if(!q.isEmpty()){
                
             ans[c] = arr[q.peek()];
             c++;
        }
        else{
            ans[c] = 0;
            c++;
        }
        
        while(!q.isEmpty() && q.peek()<=i-k) q.remove();
        
        if(arr[i]<0) q.add(i);
        }
        if(!q.isEmpty()) ans[c] = arr[q.peek()];
        
        else ans[c] = 0;
            
        return ans;
    }
}

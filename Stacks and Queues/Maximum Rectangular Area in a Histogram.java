class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    
    public static long[] nextSmaller(long hist[]){
        Stack<Integer> st = new Stack<>();
        int n = hist.length;
        long[] arr = new long[n];
        
        st.push(-1);
        
        for(int i=n-1;i>=0;i--){
            
            while(st.peek() !=-1 && hist[st.peek()] >= hist[i]) st.pop();
            
            arr[i] = st.peek();
            st.push(i);
        }
        
        return arr;
    }
    
    public static long[] prevSmaller(long hist[]){
        Stack<Integer> st = new Stack<>();
        int n = hist.length;
        long[] arr = new long[n];
        
        st.push(-1);
        
        for(int i=0;i<n;i++){
            
            while(st.peek() !=-1 && hist[st.peek()] >= hist[i]) st.pop();
            
            arr[i] = st.peek();
            st.push(i);
        }
        
        return arr;
    }
    
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long next[] = nextSmaller(hist);
        long prev[] = prevSmaller(hist);
        
        
        long ans = Long.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            if(next[i] == -1) next[i] = n;
            
            long newans = hist[i] * (next[i]-prev[i]-1);
            
            ans = Math.max(ans, newans);
        }
        
        return ans;
    }
        
}

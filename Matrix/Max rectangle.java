class Solution {
    
    public static int[] nextSmaller(int hist[]){
        Stack<Integer> st = new Stack<>();
        int n = hist.length;
        int[] arr = new int[n];
        
        st.push(-1);
        
        for(int i=n-1;i>=0;i--){
            
            while(st.peek() !=-1 && hist[st.peek()] >= hist[i]) st.pop();
            
            arr[i] = st.peek();
            st.push(i);
        }
        
        return arr;
    }
    
    public static int[] prevSmaller(int hist[]){
        Stack<Integer> st = new Stack<>();
        int n = hist.length;
        int[] arr = new int[n];
        
        st.push(-1);
        
        for(int i=0;i<n;i++){
            
            while(st.peek() !=-1 && hist[st.peek()] >= hist[i]) st.pop();
            
            arr[i] = st.peek();
            st.push(i);
        }
        
        return arr;
    }
    
    public static int getMaxArea(int hist[], int n) 
    {
        // your code here
        int next[] = nextSmaller(hist);
        int prev[] = prevSmaller(hist);
        
        
        int ans = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            if(next[i] == -1) next[i] = n;
            
            int newans = hist[i] * (next[i]-prev[i]-1);
            
            ans = Math.max(ans, newans);
        }
        
        return ans;
    }
    
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        
        int hist[] = M[0];
        
        int ans = getMaxArea(hist, hist.length);
        
        for(int i=1;i<n;i++){
            
            for(int j=0;j<m;j++){
                if(M[i][j] == 0) hist[j] = 0;
                else hist[j] += M[i][j];
                
                
            }
            ans = Math.max(ans, getMaxArea(hist, hist.length));
        }
        return ans;
    }
}

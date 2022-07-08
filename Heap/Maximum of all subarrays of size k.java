class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        
        Deque<Integer>q = new LinkedList<Integer>();
        ArrayList<Integer>ans = new ArrayList<>();
        
        
        for(int i=0;i<k;i++){
            
            while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]) q.removeLast();
            
            q.addLast(i);
        }
            
            for(int i=k;i<n;i++){
                
                ans.add(arr[q.peek()]);
                
                while(!q.isEmpty() && q.peek() <= i-k) q.removeFirst();
                
                while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]) q.removeLast();
                
                q.addLast(i);
                
            }
        ans.add(arr[q.peek()]);
        
        return ans;
    }
}

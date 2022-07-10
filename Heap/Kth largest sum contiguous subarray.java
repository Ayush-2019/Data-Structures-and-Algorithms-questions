class Solution {
    public static int kthLargest(int n, int k, int[] arr) {
        // code here
        
        Queue<Integer> ans = new PriorityQueue<>();
        
        for(int i=0;i<n;i++){
            int sum = 0;
            
            for(int j=i;j<n;j++){
                sum += arr[j];
                
                ans.add(sum);
                
                if(ans.size()>k) ans.poll();
            }
        }
        return ans.peek();
    }
}
        

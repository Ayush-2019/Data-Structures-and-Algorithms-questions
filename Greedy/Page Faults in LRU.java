class Solution{
    static int pageFaults(int n, int C, int pages[]){
        // code here
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Deque<Integer>q = new ArrayDeque<>();
        
        int ans = 0, i = 0, cap = C;
        
        while(i<n && cap>0){
            if(!map.containsKey(pages[i])){
                map.put(pages[i], 1);
                q.addLast(pages[i]);
                cap--;
                ans++;
            }
            else{
                q.remove(pages[i]);
                q.addLast(pages[i]);
            }
            i++;
        }
        
        while(i<n){
            if(!map.containsKey(pages[i])){
                
                int to_remove = q.removeFirst();
                
                map.remove(to_remove);
                
                q.addLast(pages[i]);
                map.put(pages[i], 1);
                ans++;
            }
            else{
                q.remove(pages[i]);
                q.addLast(pages[i]);
            }
            i++;
        }
        
        return ans;
    }
}

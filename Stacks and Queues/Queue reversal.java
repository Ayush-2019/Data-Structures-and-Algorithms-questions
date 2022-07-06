class GfG{
    //Function to reverse the queue.
    
    public void solve(Queue<Integer> q){
        
        if(q.size() == 0){
            return;
        }
        int c = q.remove();
        
        solve(q);
        
        q.add(c);
    }
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        solve(q);
        return q;
    }
}

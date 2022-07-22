class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int[] vis = new int[V];
        vis[0]=1;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        while(q.isEmpty()!=true){
            int curr = q.remove();
            ans.add(curr);
            
            for(int i=0;i<adj.get(curr).size();i++){
                
                if(vis[adj.get(curr).get(i)]==0){
                    
                    q.add(adj.get(curr).get(i));
                    vis[adj.get(curr).get(i)]++;
                    
                }
                
            }
        }
        
        
        
        return ans;
    }
}

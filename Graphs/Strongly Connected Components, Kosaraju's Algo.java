class Solution
{
    //Function to find number of strongly connected components in the graph.
    public void dfs(ArrayList<ArrayList<Integer>> adj, int i, int[] vis1, ArrayList<Integer> ord){
        
        vis1[i]++;
            for(int j=0;j<adj.get(i).size();j++){
                if(vis1[adj.get(i).get(j)] == 0){
                    dfs(adj,adj.get(i).get(j),vis1,ord);
                }
            }
            
            ord.add(i);
        }
        
    public void rev_dfs(ArrayList<ArrayList<Integer>> rev, int i, int[] vis2){
        
        vis2[i]++;
            for(int j=0;j<rev.get(i).size();j++){
                if(vis2[rev.get(i).get(j)] == 0){
                    rev_dfs(rev,rev.get(i).get(j),vis2);
                }
            }
            
        }
    
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        ArrayList<ArrayList<Integer>> rev = new ArrayList<ArrayList<Integer>>();
        
        
        for(int i=0;i<V;i++) rev.add(new ArrayList<Integer>());
        
        
        for(int i=0;i<V;i++){
            
            for(Integer j : adj.get(i)){
                
                rev.get(j).add(i);
            }
        }
        
        int[] vis1 = new int[V];
        int[] vis2 = new int[V];
        
        ArrayList<Integer> ord = new ArrayList<Integer>();
        
        for(int i=0;i<V;i++){
            if(vis1[i]==0){
                dfs(adj,i,vis1,ord);
            }
        }
        int c=0;
        
        for(int i=ord.size()-1;i>=0;i--){
            if(vis2[ord.get(i)] == 0){
                c++;
                rev_dfs(rev,ord.get(i),vis2);
            }
        }
        
        return c;
    }
}

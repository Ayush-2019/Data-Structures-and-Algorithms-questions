class Solution
{
    
    public void dfs(ArrayList<ArrayList<Integer>>adj, boolean[] vis, int[] color, int i){
        
        vis[i] = true;
        
        if(color[i] == 0){
            
            for(int j=0;j<adj.get(i).size();j++){
                color[adj.get(i).get(j)] = 1;
            }
        }
        
        else{
            for(int j=0;j<adj.get(i).size();j++){
                color[adj.get(i).get(j)] = 0;
            }
        }
        
        for(int z=0;z<adj.get(i).size();z++){
            
            if(vis[adj.get(i).get(z)] == false){
                dfs(adj,vis,color,adj.get(i).get(z));
            }
        }
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        boolean[] vis = new boolean[V];
        
        int[] color = new int[V];
        
        for(int k=0;k<V;k++){
        
        if(vis[k] == false){
            color[k] = 0;
            dfs(adj,vis,color,k);
        }
        
        }
        
        for(int i=0;i<V;i++){
            for(int j=0;j<adj.get(i).size();j++){
                if(color[i] == color[adj.get(i).get(j)]){
                    return false;
                }
            }
        }
        return true;
    }
}

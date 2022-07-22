class Solution 
{
    //Function to detect cycle in a directed graph.
    
    public boolean dfs(int V , ArrayList<ArrayList<Integer>> adj , int[] vis,int ind,int[] dir){
        vis[ind]++;
        dir[ind]++;
        for(int i=0;i<adj.get(ind).size();i++){
            
            if(vis[adj.get(ind).get(i)]==0){
                
               if(dfs(V,adj,vis,adj.get(ind).get(i),dir)==true){ 
                   return true;
               }
               
            }
            
            else if(dir[adj.get(ind).get(i)]==1){
                return true;
            }
            
        }
        dir[ind]=0;
        return false;
    }
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        int[] dir = new int[V];
        int[] vis = new int[V];
        for(int p=0;p<V;p++){
            if(vis[p]==0){
        if(dfs(V,adj,vis,p,dir)==true){
            return true;
        }
                
            }
        }
        
        return false;
        
    }
}

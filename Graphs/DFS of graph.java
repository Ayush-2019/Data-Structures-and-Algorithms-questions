class Solution
{
    //Function to return a list containing the DFS traversal of the graph.
    static void dfs(int V, ArrayList<ArrayList<Integer>> adj,int ind,int[] vis,ArrayList<Integer>ans){
        ans.add(ind);
        vis[ind]++;
        
        for(int i=0;i<adj.get(ind).size();i++){
            
            if(vis[adj.get(ind).get(i)]==0){
            dfs(V,adj,adj.get(ind).get(i),vis,ans);
            }
        }
        
    }
    static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        int[] vis = new int[V];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        dfs(V,adj,0,vis,ans);
        return ans;
        
    }
}

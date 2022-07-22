class Solution {
    
    void dfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int i){
        
        vis[i]++;
        
        for(int j=0;j<adj.get(i).size();j++){
            if(vis[adj.get(i).get(j)]==0){
                dfs(adj,vis,adj.get(i).get(j));
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        
        int cables = connections.length;
        
        if(cables<n-1) return -1;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
        
        for(int i=0;i<n;i++) adj.add(new ArrayList<Integer>());
        
        for(int i=0;i<connections.length;i++){
            
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);
        }
        
        int c = 0;
        
        int[] vis = new int[n];
        
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                c++;
                dfs(adj,vis,i);
            }
        }
        
        return c-1;
    }
}

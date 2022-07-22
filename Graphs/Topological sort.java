class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] in_degree = new int[V];
        
        int[] ans = new int[V];
        int c=0;
        
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                in_degree[adj.get(i).get(j)]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0;i<V;i++){
            if(in_degree[i]==0) q.add(i);
        }
        
        while(!q.isEmpty()){
            int curr = q.remove();
            ans[c] = curr;
            c++;
            
            for(int i=0;i<adj.get(curr).size();i++){
                in_degree[adj.get(curr).get(i)]--;
                if(in_degree[adj.get(curr).get(i)]==0) q.add(adj.get(curr).get(i));
            }
            
        }
        
        return ans;
    }
}

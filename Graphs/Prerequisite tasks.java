class Solution {
    public boolean isPossible(int N, int[][] link)
    {
        // Your Code goes here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int[] in_degree = new int[N];
        
        for(int i=0;i<N;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            adj.add(temp);
        }
        
        for(int i=0;i<link.length;i++){
            adj.get(link[i][1]).add(link[i][0]);
        }
        
        int c = 0;
        
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                in_degree[adj.get(i).get(j)]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0;i<N;i++){
            if(in_degree[i]==0){
                q.add(i);
                c++;
                
            }
        }
        
        while(!q.isEmpty()){
            int curr = q.remove();
            
            for(int i=0;i<adj.get(curr).size();i++){
                in_degree[adj.get(curr).get(i)]--;
                if(in_degree[adj.get(curr).get(i)]==0){
                    q.add(adj.get(curr).get(i));
                    c++;
                    
                }
            }
            
        }
        
        return c==N;
    }
    
}

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    
    static int min_vertex(int dist[], boolean processed[], int V){
        
        int min_dist = Integer.MAX_VALUE;
        int min_index = -1;
        for(int i=0;i<V;i++){
            if(processed[i]==false && /*check here*/dist[i]<min_dist){
                min_dist = dist[i];
                min_index = i;
            }
        }
        
        return min_index;
    }
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int[] dist = new int[V];
        
        boolean[] processed = new boolean[V];
        
        for(int i=0;i<V;i++){
            dist[i] = Integer.MAX_VALUE;
            processed[i] = false;
        }
        
        dist[S] = 0;
        
        for(int count=0; count<=V-1;count++){
            
            int u = min_vertex(dist,processed,V);
            
            processed[u] = true;
            
            for(int i=0;i<adj.get(u).size();i++){
                if(/*!processed[adj.get(u).get(i).get(0)]  dist[u] != Integer.MAX_VALUE*/ dist[u] + adj.get(u).get(i).get(1)< dist[adj.get(u).get(i).get(0)]){
                     dist[adj.get(u).get(i).get(0)] = dist[u] + adj.get(u).get(i).get(1);
                }
            }
            
        }
        
        return dist;
    }
}


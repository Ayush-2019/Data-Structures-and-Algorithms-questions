class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        int[] dist = new int[n];
        
        for(int i=0;i<n;i++) dist[i] = Integer.MAX_VALUE;
        
        dist[0] = 0;
        
        for(int i=1;i<n;i++){
            
            for(int j=0;j<edges.length;j++){
                
                if(dist[edges[j][0]]!=Integer.MAX_VALUE && dist[edges[j][0]] + edges[j][2] < dist[edges[j][1]]){
                    
                    dist[edges[j][1]] = dist[edges[j][0]] + edges[j][2];
                }
            }
        }
        
        for(int j=0;j<edges.length;j++){
                
                if(dist[edges[j][0]]!=Integer.MAX_VALUE && dist[edges[j][0]] + edges[j][2] < dist[edges[j][1]]){
                    
                    return 1;
                }
            }
            
            return 0;
    }
}

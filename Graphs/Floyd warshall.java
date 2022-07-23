class Solution
{
    public void shortest_distance(int[][] dist)
    {
        // Code here 
        
        int n = dist.length;
        
        for(int k=0;k<n;k++){
            
            for(int i=0;i<n;i++){
                
                for(int j=0;j<n;j++){
                    
                    if(dist[i][k]!=-1 && dist[k][j]!=-1 && dist[i][j]!=-1 && dist[i][k] + dist[k][j] < dist[i][j]){
                       dist[i][j] = dist[i][k] + dist[k][j];
                    }
                    else if(dist[i][k]!=-1 && dist[k][j]!=-1 && dist[i][j]==-1){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
    }
}

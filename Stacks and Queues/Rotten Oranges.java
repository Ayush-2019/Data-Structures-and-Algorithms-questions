class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<int[]>q = new LinkedList<>();
        
        int n = grid.length, m = grid[0].length;
        int count = 0, ans = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(grid[i][j] == 1) count++;
                
                if(grid[i][j] == 2) q.add(new int[]{i,j});
                    
                
            }
        }
        
        
        while(!q.isEmpty()){
            
            if(count == 0) return ans;
            
            int size = q.size();
            
            while(size>0){
                
                int index[] = q.remove();
                int i = index[0];
                int j = index[1];
                
                    //1st
                    if((i-1>=0 && i-1<n) && grid[i-1][j] == 1){
                    
                        count--;
                        grid[i-1][j] = 2;
                        q.add(new int[]{i-1,j});
                        
                    
                    }
                    //2nd
                    if((i+1>=0 && i+1<n) && grid[i+1][j] == 1){

                        count--;
                        grid[i+1][j] = 2;
                        q.add(new int[]{i+1,j});
                    
                    }
                    //3rd
                    if((j-1>=0 && j-1<m) && grid[i][j-1] == 1){
 
                        count--;
                        grid[i][j-1] = 2;
                        q.add(new int[]{i,j-1});
                    
                    }
                    //4th
                    if((j+1>=0 && j+1<m) && grid[i][j+1] == 1){

                        count--;
                        grid[i][j+1] = 2;
                        q.add(new int[]{i,j+1});
                        
                    }
                    
                
            size--;
        }
        ans++;
        
    }
    if(count!=0) return -1;
    return ans;
    }
}

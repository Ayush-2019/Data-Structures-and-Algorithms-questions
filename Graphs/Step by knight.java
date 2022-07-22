class Solution
{
    
    class Pair{
        int r,c;
        
        Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        // Code here
        int ki = KnightPos[1]-1;
        int kj = KnightPos[0]-1;
        
        int ti = TargetPos[1]-1;
        int tj = TargetPos[0]-1;
        
        int vis[][] = new int[n][n];
        
        Queue<Pair> q1 = new LinkedList<Pair>();
        Pair source = new Pair(ki,kj);
        q1.add(source);
        
        int i = ki;
        int j = kj;
        if(ki==ti && kj==tj){
            return 0;
        }
        
        int row[] = {1,1,-1,-1,2,2,-2,-2};
        int col[] = {2,-2,2,-2,1,-1,1,-1};
        
        while(!q1.isEmpty()){
            
            if(vis[ti][tj]!=0){
                break;
            }
            
            Pair p = q1.remove();
            i = p.r;
            j = p.c;
            
            
            for(int k=0;k<8;k++){
                if(i+row[k]>=0 && i+row[k]<n && j+col[k]>=0 && j+col[k]<n && vis[i+row[k]][j+col[k]]==0){
                vis[i+row[k]][j+col[k]] = vis[i][j]+1;
                Pair moved = new Pair(i+row[k], j+col[k]);
                q1.add(moved);
            }
            }
            
            
            }
        return vis[ti][tj];
    }
}

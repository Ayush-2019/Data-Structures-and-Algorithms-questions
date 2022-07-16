class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    
    public boolean canColor(boolean graph[][], int color[], int col, int n, int node){
        
        for(int i=0;i<n;i++){
            if(graph[node][i] && color[i] == col) return false;
        }
        
        return true;
    }
    
    public boolean solve(boolean graph[][],int color[], int m, int n, int node){
        
        if(node == n) return true;
            
            for(int col=0;col<m;col++){
                
                if(canColor(graph, color,col, n, node)) {
                    color[node] = col;
                    if(solve(graph, color, m, n, node+1)) return true;
                    color[node] = -1;
                }
            }
            return false;
    }
    
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int color[] = new int[n];
        Arrays.fill(color,-1);
        
        color[0] = 0;
        return solve(graph, color, m, n, 0);
        
    }
}

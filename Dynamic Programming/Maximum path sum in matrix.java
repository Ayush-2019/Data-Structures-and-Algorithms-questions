class Solution{
    static int maximumPath(int n, int matrix[][])
    {
        // code here
        
        int res = -1;
        
        for(int j=0;j<n;j++) res = Math.max(res, matrix[0][j]);
        
        for(int i=1;i<n;i++){
            res = -1;
            
            for(int j=0;j<n;j++){
                
                if(j>0 && j<n-1) matrix[i][j] += Math.max(matrix[i-1][j], Math.max(
                        matrix[i-1][j-1], matrix[i-1][j+1]
                    ));
                    
                    else if(j == n-1) matrix[i][j] +=  Math.max(matrix[i-1][j], matrix[i-1][j-1]);
                    
                    else matrix[i][j] +=  Math.max(matrix[i-1][j], matrix[i-1][j+1]);
                    
                    res = Math.max(res, matrix[i][j]);
            }
        }
        
        return res;
    }
}

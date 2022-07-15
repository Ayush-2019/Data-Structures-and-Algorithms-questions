class Solution
{
    //Function to find a solved Sudoku.
    
    static boolean canFill(int i, int j, int k, int grid[][]){
        for(int num=0;num<9;num++){
            if(grid[i][num] == k) return false;
            if(grid[num][j] == k) return false;
            if(grid[3*(i/3) + num/3][3*(j/3)+num%3] == k) return false;
        }
        return true;
        
    }
    
    static boolean solve(int grid[][]){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j] == 0){
                    
                    for(int k=1;k<10;k++){
                        if(canFill(i,j,k, grid)){
                            grid[i][j] = k;
                            
                            boolean further = solve(grid);
                            
                            if(further) return true;
                            else{
                                grid[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return solve(grid);
        
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j] + " ");
            }
        }
    }
}

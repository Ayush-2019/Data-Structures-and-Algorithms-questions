class Solution {
    
    public void dfs(int[][] image,int curr, int i,int j, int newColor, int[][] vis){
        
        if(i>=image.length || j>=image[0].length || i<0 || j<0)
            return;
        
        if(image[i][j]!=curr || vis[i][j]!=0)
            return;
        else
            image[i][j]=newColor;
        
        vis[i][j] = 1;
        
        
        dfs(image,curr,i,j+1,newColor,vis);
        dfs(image,curr,i,j-1,newColor,vis);
        dfs(image,curr,i+1,j,newColor,vis);
        dfs(image,curr,i-1,j,newColor,vis);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int[][] vis = new int[image.length][image[0].length];
        dfs(image,image[sr][sc],sr,sc,newColor,vis);
        
        return image;
        
    }
}

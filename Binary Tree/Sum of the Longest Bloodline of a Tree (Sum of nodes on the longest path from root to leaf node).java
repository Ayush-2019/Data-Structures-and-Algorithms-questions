class Solution{
    
    int edge=0, ans=0;
    
    public void solve(Node root, int sum, int count){
        
        if(root.left == null && root.right == null){
            sum += root.data;
            
            if(count >= edge){
            edge = count;
            ans = sum;
            }
        }
        
        if(root.left != null) solve(root.left, sum+root.data, count+1);
        
        if(root.right != null) solve(root.right, sum+root.data, count+1);
    }
    
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        edge=0;
        ans = 0;
        
        solve(root, 0, 0);
        
        return ans;
    }
}

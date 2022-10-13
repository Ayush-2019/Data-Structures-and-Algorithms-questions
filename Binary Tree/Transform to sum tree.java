class Solution{
    
    int calc(Node root){
        
        if(root == null) return 0;
         
         int l = calc(root.left);
         int r = calc(root.right);
         
         int store = root.data;
         int total = l + r;
         root.data = total;
         return total + store;
    }
    public void toSumTree(Node root){
         //add code here.
         calc(root);
    }
}

class Tree
{
    
    public void solve(Node node, int target, Vector<Integer>list){
        
        if(list.size() !=0 && list.get(list.size()-1) == target) return;
        
        if(node == null) return;
        
        list.add(node.data);
        
        if(list.size() !=0 && list.get(list.size()-1) == target) return;
        
        solve(node.left, target, list);
        solve(node.right, target, list);
        
        if(list.size() !=0 && list.get(list.size()-1) == target) return;
        
        list.remove(list.size()-1);
    }
    
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        Vector<Integer> list = new Vector<>();
        
        solve(root, node, list);
        
        if(list.size() < k+1) return -1;
        
        return list.get(list.size()-1-k);
    }
}

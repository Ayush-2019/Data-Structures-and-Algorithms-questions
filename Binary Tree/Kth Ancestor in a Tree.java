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
    
    //eff. approach O(1) space
    static Node kthAncestorDFS(Node root, int node )
{
    if (root == null)
        return null;
     
    if (root.data == node||
    (temp = kthAncestorDFS(root.left,node)) != null ||
    (temp = kthAncestorDFS(root.right,node)) != null)
    {
        if (k > 0)    
            k--;
         
        else if (k == 0)
        {
            System.out.print("Kth ancestor is: "+root.data);
             
            
            return null;
        }
         
        return root;
    }
    return null;
        
        //if (kthAncestorDFS(root,node) != null) System.out.println("-1");    Put this code in main function
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

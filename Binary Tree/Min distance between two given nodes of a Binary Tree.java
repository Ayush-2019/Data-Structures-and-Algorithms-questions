class GfG {
    
    int ad, bd, ld;
    
    void get_dist(Node root, int a, int b, int lca_data, int edge){
        
        if(root == null) return;
        
        if(root.data == a) ad = Math.min(edge, ad);
        
        if(root.data == b) bd = Math.min(edge, bd);
        
        if(root.data == lca_data) ld = Math.min(edge, ld);
        
        get_dist(root.left, a, b, lca_data, edge+1);
        get_dist(root.right, a, b, lca_data, edge+1);
        
    }
    
    Node lca(Node root, int n1,int n2)
	{
		// Your code here
		
		if(root == null) return null;
		
		if(root.data == n1 || root.data == n2) return root;
		
		Node left = lca(root.left, n1, n2);
		Node right = lca(root.right, n1, n2);
		
		if(left != null && right != null) return root;
		
		if(left != null) return left;
		
		return right;
	}
    
    int findDist(Node root, int a, int b) {
        // Your code here
        
        Node lca_node = lca(root, a, b);
        
        ad = Integer.MAX_VALUE; bd = Integer.MAX_VALUE; ld = Integer.MAX_VALUE;
        
        get_dist(root, a, b, lca_node.data, 0);
        
        return ad+bd-(2*ld);
        
    }
}

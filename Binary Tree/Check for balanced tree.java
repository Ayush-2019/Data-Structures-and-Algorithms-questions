class Tree
{
    int flag = 1;
    
    int check(Node root){
        if(root==null){
            return 0;
        }
        int l = check(root.left);
        int r = check(root.right);
        if(Math.abs(l-r)>1){
            flag=0;
        }
        return 1+Math.max(l,r);
    }
    boolean isBalanced(Node root)
    {
	// Your code here
	check(root);
	return flag==1;
	
    }
}


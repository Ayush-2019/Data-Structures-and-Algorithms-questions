class Solution
{
    void leaf(Node l_root,ArrayList<Integer> ans){
        if(l_root.left==null && l_root.right==null){
            ans.add(l_root.data);
            return;
        }
        if(l_root.left!=null)
        leaf(l_root.left,ans);
        
        if(l_root.right!=null)
        leaf(l_root.right,ans);
    }
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    Stack<Integer> s = new Stack<Integer>();
	    
	    if(root == null) return ans;
	    if(root.left==null && root.right == null) {ans.add(root.data); return ans;}
	    Node temp = root;
	    
	    ans.add(root.data);
	    
	    if(root.left!=null){
	        
	    temp = root.left;
	    while(temp.left!=null || temp.right!=null){
	        if(temp==null){
	            break;
	        }
	        ans.add(temp.data);
	        
	        if(temp.left!=null)
	        temp=temp.left;
	        
	        else if(temp.right!=null)
	        temp=temp.right;
	    }
	    }
	    
	    Node l_root = root;
	    leaf(l_root,ans);
	    
	    if(root.right!=null){
	    temp = root.right;
	    while(temp.right!=null || temp.left!=null){
	        if(temp==null){
	            break;
	        }
	        s.push(temp.data);
	        
	        if(temp.right!=null){
	            temp=temp.right;
	        }
	        else{
	            temp=temp.left;
	        }
	    }
	    
	    while(!s.isEmpty()){
	        ans.add(s.pop());
	    }
	    }
	    return ans;
	    
	}
}

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> ans = new ArrayList<>();
	    Stack<Integer> st = new Stack<>();
	    Queue<Node> q = new LinkedList<>();
	    
	    q.add(root);
	    int dir = 0;
	    Node curr;
	    while(!q.isEmpty()){
	        int sz = q.size();
	        while(sz>0){
	            curr = q.remove();
	            if(curr.left!=null)
	               q.add(curr.left);
	               
	            if(curr.right!=null)
	               q.add(curr.right);
	               
	           if(dir%2==0){
	               ans.add(curr.data);
	           }
	           else{
	               st.push(curr.data);
	           }
	           sz--;
	        }
	        while(!st.isEmpty()){
	            ans.add(st.pop());
	        }
	        dir++;
	    }
	    return ans;
	}
}

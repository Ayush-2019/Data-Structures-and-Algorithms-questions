class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    
    Node head = null,prev = null;
    void calc(Node root){
        
        if(root==null){
            return;
        }
        calc(root.left);
        
        if(this.head == null) this.head = root;
        if(this.prev == null) this.prev = root;
        
        if(this.head!=root){
        this.prev.right = root;
        root.left = this.prev;
        this.prev = root;
        }
        
        calc(root.right);
        
        
    }
    Node bToDLL(Node root)
    {
	//  Your code here	
	
	calc(root);
	
	this.prev.right = null;
	this.head.left = null;
	
	return head;
    }
}

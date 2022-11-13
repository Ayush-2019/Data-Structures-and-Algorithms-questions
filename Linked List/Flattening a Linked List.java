/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    
    Node mergeList(Node a, Node b){
        
        Node res = new Node(0);
        
        Node temp = res;
        
        while(a!=null && b!=null){
            
            if(a.data<b.data){
                temp.bottom = a;
                a = a.bottom;
            }
            else{
                temp.bottom = b;
                b = b.bottom;
            }
            temp = temp.bottom;
        }
        
        while(a!=null){
            temp.bottom = a;
            a = a.bottom;
            temp = temp.bottom;
        }
        
        while(b!=null){
            temp.bottom = b;
            b = b.bottom;
            temp = temp.bottom;
        }
        
        return res.bottom;
    }
    
    Node flatten(Node root)
    {
	// Your code here
	
	if(root == null || root.next == null) return root;
	
	root.next = flatten(root.next);
	
	root = mergeList(root, root.next);
	
	return root;
    }
}

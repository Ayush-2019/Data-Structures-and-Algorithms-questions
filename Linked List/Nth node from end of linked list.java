/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node i = head, j = head;
    	
    	while(j!=null && n>0){
    	    j = j.next;
    	    n--;
    	}
    	
    	if(n>0) return -1;
    	
    	while(j!=null){
    	    i = i.next;
    	    j = j.next;
    	}
    	
    	return i.data;
    }
}

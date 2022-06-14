boolean isCircular(Node head)
    {
	// Your code here	
	Node p = head;
	
	while(p!=null && p.next!=head){
	    p = p.next;
	}
	
	if(p == null) return false;
	return true;
    }

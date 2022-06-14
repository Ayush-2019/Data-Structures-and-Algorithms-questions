Node removeDuplicates(Node head)
    {
	// Your code here
	Node p1 = head;
	Node p2 = head.next;
	
	while(p2!=null){
	    if(p2.data == p1.data){
	        if(p2.next == null){
	            p1.next = null;
	            p2 = null;
	        }
	        else p2 = p2.next;
	    }
	    
	    else{
	        p1.next = p2;
	        p1 = p2;
	        p2 = p1.next;
	    }
	}
	
	return head;
    }

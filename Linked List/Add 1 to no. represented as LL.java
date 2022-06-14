public static Node rev(Node head){
         Node prev=null;
        Node next=null;
        Node curr=head;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        
        Node p = rev(head);
        
        Node temp = p;
        
        if(p == null) return head;
        
        while(p.data==9){
            if(p.next == null) break;
            
            p.data = 0;
            p = p.next;
        }
        p.data = p.data+1;
        
        return rev(temp);
    }

Node reverseList(Node head)
    {
        // code here
        Node prev=null;
        Node next=null;
        Node curr=head;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }

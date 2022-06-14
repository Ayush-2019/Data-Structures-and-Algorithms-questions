public static Node reverse(Node node, int k)
    {
        //Your code here
        Node prev=null;
        Node curr=node;
        Node next=null;
        int c=0;
        while(c<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;
        }
        if(next!=null){
            node.next=reverse(next,k);
        }
        return prev;
    }

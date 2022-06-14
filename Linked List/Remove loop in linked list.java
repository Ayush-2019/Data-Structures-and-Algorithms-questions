public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node low=head;
        Node high=head;
        while(high!=null && high.next!=null){
            low=low.next;
            high=high.next.next;
            if(low==high){
                break;
            }
        }
        if(low==head){
            while(high.next!=low){
                high=high.next;
            }
            high.next=null;
        }
        else if(low==high){
            low=head;
            while(low.next!=high.next){
                low=low.next;
                high=high.next;
            }
            high.next=null;
        }
    }

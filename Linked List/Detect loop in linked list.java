 public static boolean detectLoop(Node head){
        Node low=head;
        Node high=head;
        while(high!=null && high.next!=null){
            low=low.next;
            high=high.next.next;
            if(low==high){
                return true;
            }
        }
        return false;
        
    }

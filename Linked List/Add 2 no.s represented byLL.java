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
    
    
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
       Node f = rev(first);
       Node s = rev(second);
       
       int c=0,sum=0;
       Node temp,revn = null, curr = null;
       
       while(f!=null || s!=null){
           sum = c+((f!=null) ? f.data : 0) + ((s!=null) ? s.data:0);
           
           c = sum/10;
           sum = sum%10;
           temp = new Node(sum);
           
           if(revn == null) revn = temp;
           else curr.next = temp;
           curr = temp;
           
           if(f!=null) f = f.next;
           if(s!=null) s = s.next;
       }
       
       if(c>0){
           temp = new Node(c);
           curr.next = temp;
           curr = temp;
       }
       
       return rev(revn);
    }

int len(Node head){
        int length = 0;
        
        while(head!=null){
            length++;
            head = head.next;
        }
        
        return length;
    }
	int intersectPoint(Node h1, Node h2)
	{
         // code here
         int l1 = len(h1);
         int l2 = len(h2);
         int d = Math.abs(l1-l2),c = 0;
         
         while(c!=d){
             if(l1>l2){
                 h1 = h1.next;
                 c++;
             }
             
             else{
                 h2 = h2.next;
                 c++;
             }
         }
         
         while(h1!=h2){
             h1 = h1.next;
             h2 = h2.next;
         }
         
         if(h1!=null) return h1.data;
         
         return -1;
	}

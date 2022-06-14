 public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashMap<Integer,Integer> map = new HashMap<>();
         
         Node p2 = head.next;
         Node p1 = head;
         
         map.put(head.data,1);
         
         while(p2!=null){
             if(map.containsKey(p2.data)){
                 
                 if(p2.next == null){
                     p1.next = p2.next;
                     p2 = null;
                 }
                 
                 else p2 = p2.next;
             }
             
             else{
                 map.put(p2.data,1);
                 p1.next = p2;
                 p1 = p2;
                 p2 = p1.next;
             }
         }
         
         return head;
    }

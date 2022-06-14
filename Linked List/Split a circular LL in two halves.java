 void splitList(circular_LinkedList list)
   {
            // Your code here
            Node head = list.head;
            Node mid = findMid(head);
            Node last = mid.next;
            while(last.next!=head){
                last = last.next;
            }
            list.head2 = mid.next;
            list.head1 = head;
            last.next = mid.next;
            mid.next = head;
 }
 
  Node findMid(Node head){
      Node slow = head, fast = head;
      while(fast.next!=head && fast.next.next!=head){
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow;
  }

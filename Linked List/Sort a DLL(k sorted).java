// Java implementation to sort a k sorted doubly
class GFG
{

static class Node
{
	int data;
	Node next, prev;
	Node(int d)
	{
	data = d;
	next = prev = null;
	}
}


// Using Insertion Sort Time Complexity: O(n*k) Space Complexity: O(1)
Node sortAKSortedDLL( Node head, int k) {
	if(head == null || head.next == null)
		return head;

	for(Node i = head.next; i != null; i = i.next) {
		Node j = i;

		while(j.prev != null && j.data < j.prev.data) {
			
			int temp = j.data;
          j.data = j.prev.data;
          j.prev.data = temp;
          j = j.prev;
		}
		
	}
	return head;
}
  
  class compareNode implements Comparator<Node>
  {
    public int compare(Node n1, Node n2){
      return n1.data-n2.data;
    }
  }
 
  //Efficient Approach Time Complexity: O(n*log k) Auxiliary Space: O(k)
  Node sortAKSortedDLLEff( Node head, int k)
  {

    if (head == null)
      return head;

    PriorityQueue<Node> pq = new PriorityQueue<Node>(new compareNode());
 
    Node newHead = null, last = null;

    for (int i = 0; head != null && i <= k; i++)
    {
       
      pq.add(head);
      head = head.next;
    }
 
    while (!pq.isEmpty())
    {
      if (newHead == null)
      {
        newHead = pq.peek();
        newHead.prev = null;

        last = newHead;
      }
 
      else
      {
        last.next = pq.peek();
        pq.peek().prev = last;
        last = pq.peek();
      }
 
      pq.poll();

      if (head != null)
      {
         
        pq.add(head);

        head = head.next;
      }
    }
 
    last.next = null;
 
    return newHead;
  }
  
}


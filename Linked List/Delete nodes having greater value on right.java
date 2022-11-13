/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    
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
    
  //Approach 1:- TC:- O(n2) SC:- O(1)
    Node compute(Node head)
    {
        // your code here
        Node i = head, j = i.next, prev = null;
        
        while(i.next!=null){
            int f = 0;
            while(j!=null){
                if(i.data<j.data){
                    if(prev == null){
                        head = i.next;
                        
                    }
                    else{
                        //Node next = i.next;
                        prev.next = i.next;
                        
                    }
                    f=1;
                    
                    break;
                }
                j = j.next;
            }
            if(f==0) prev = i;
            i = i.next;
            j = i.next;
        }
        return head;
    }
  
  //Approach 2:- TC:- O(n) SC:- O(1)
  Node computeEff(Node head){
      Node rev = reverseList(head), prev = null;
        
        int maxn = Integer.MIN_VALUE;
        Node i = rev;
        
        while(i != null){
            
            if(i.data >= maxn){
                maxn = i.data;
                prev = i;
                i = i.next;
            }
            else{
                if(prev==null){
                    rev = i.next;
                }
                else{
                    prev.next = i.next;
                }
                i = i.next;
            }
        }
        Node ans = reverseList(rev);
        return ans;
  }
}
  

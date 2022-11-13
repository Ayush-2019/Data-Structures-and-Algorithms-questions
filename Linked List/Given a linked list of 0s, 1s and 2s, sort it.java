//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        
        if(head==null || head.next==null) return head;
        
        Node z = new Node(-1);
        Node rz = z;
        
       
        Node o = new Node(-1);
        Node ro = o;
        
        
        Node t = new Node(-1);
        Node rt = t;
        
        Node curr = head;
        
        while(curr!=null){
            
            if(curr.data == 0){
                z.next = curr;
                z = z.next;
            }
            
            else if(curr.data == 1){
                o.next = curr;
                o = o.next;
            }
            
            else{
                t.next = curr;
                t = t.next;
            }
            curr = curr.next;
        }
        Node ans = rz.next;
        
        o.next = rt.next;
        z.next = ro.next;
        t.next = null; //Must add, idk why
        
        return rz.next;
    }
}



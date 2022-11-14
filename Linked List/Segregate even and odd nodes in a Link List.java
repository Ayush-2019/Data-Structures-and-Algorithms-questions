/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        // code here
        
        Node e = new Node(-1);
        Node re = e;
        
        Node o = new Node(-1);
        Node ro = o;
        
        Node i = head;
        
        while(i!=null){
            if(i.data%2 == 0){
                e.next = i;
                e = e.next;
            }
            
            else{
                o.next = i;
                o = o.next;
            }
            i = i.next;
        }
        
        e.next = ro.next;
        o.next = null;
        
        return re.next;
    }
}

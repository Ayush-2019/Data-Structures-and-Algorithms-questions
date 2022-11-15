/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}*/
// you have to complete this function
class GfG
{
    
    public static Node partition(Node head, Node low, Node high){
        
        Node pivot = high;
        Node i = low, j = low, prev = low;
        
        while(j!=high){
            if(j.data < pivot.data){
                prev = i;
            
                
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
                i = i.next;
            }
            j = j.next;
        }
        
        int temp = i.data;
        i.data = high.data;
        high.data = temp;
        
        return prev;
    }
    
    
    public static void qSort(Node head, Node low, Node high){
        
        if(low != high){
            
            Node f_end = partition(head, low, high);
            
            qSort(head, low, f_end);
            qSort(head, f_end.next, high);
            
        }
    }
    
    public static Node quickSort(Node head)
    {
        //Your code here
        if(head == null || head.next == null) return head;
        Node low = head, high = head;
        
        while(high.next!=null){
            high = high.next;
        }
        
        qSort(head, low, high);
        
        return head;
    }
    
    
}

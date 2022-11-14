//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    
    public static Node merge(Node a, Node b)
    {
        Node res = null;
        
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        if (a.data <= b.data) 
        {
            res = a;
            res.next = merge(a.next, b);
        } 
        else
        {
            res = b;
            res.next = merge(a, b.next);
        }
        
        return res;
    }
    
    public static Node getMiddle(Node head)
    {
        if (head == null)
            return head;
            
        Node fastptr = head.next;
        Node slowptr = head;
         
        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }

        return slowptr;
    }
    
    public static Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
           return head;
        
        Node middle = getMiddle(head);
        Node nom = middle.next;
        middle.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(nom);
        
        Node sorted = merge(left, right);
        return sorted;
        
    }
    
    

}

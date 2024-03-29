/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        Queue<Integer>pq = new PriorityQueue<>();
        
        for(int i=0;i<K;i++){
            
            Node temp = arr[i];
            
            while(temp!=null){
                pq.add(temp.data);
                temp = temp.next;
            }
        }
        
        Node temp = new Node(pq.peek());
        pq.poll();
        Node head = temp;
        
        while(!pq.isEmpty()){
            Node list = new Node(pq.peek());
            pq.poll();
            temp.next = list;
            temp = temp.next;
        }
        return head;
    }
}

class DLLNode {
    DLLNode prev;
    int data;
    DLLNode next;
    DLLNode(int data) { this.data = data; }
}
 
public class myStack {
    DLLNode head;
    DLLNode mid;
    DLLNode prev;
    DLLNode next;
    int size;
  
    void push(int new_data)
    {
 
        DLLNode new_node = new DLLNode(new_data);
     
        if (size == 0) {
            head = new_node;
            mid = new_node;
            size++;
            return;
        }
        head.next = new_node;
        new_node.prev = head;
 
        head = head.next;
        if (size % 2 != 0) {
            mid = mid.next;
        }
        size++;
    }
 
    int pop()
    {
        int data = -1;
        if (size == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
 
        if (size != 0) {
            if (size == 1) {
                head = null;
                mid = null;
            }
            else {
                data = head.data;
                head = head.prev;
                head.next = null;
                if (size % 2 == 0) {
                    mid = mid.prev;
                }
            }
            size--;
        }
        return data;
    }
 
    int findMiddle()
    {
        if (size == 0) {
            System.out.println("Stack is empty now");
            return -1;
        }
        return mid.data;
    }
    void deleteMiddleElement()
    {
        
        if (size != 0) {
            if (size == 1) {
                head = null;
                mid = null;
            }
            else if (size == 2) {
                head = head.prev;
                mid = mid.prev;
                head.next = null;
            }
            else {
                mid.next.prev = mid.prev;
                mid.prev.next = mid.next;
                if (size % 2 == 0) {
                    mid = mid.prev;
                }
                else {
                    mid = mid.next;
                }
            }
            size--;
        }
    }
 

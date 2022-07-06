class LRUCache
{
    //Constructor for initializing the cache capacity with the given value.
    
    static int size;
    static HashMap<Integer, Node> cache;
    static Node head;
    static Node tail;
    
    LRUCache(int cap)
    {
        //code here
        this.size = cap;
        cache = new HashMap<>(cap);
        head = null;
        tail = null;
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        // your code here
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            front(node,1);
            return node.value;
        }
        return -1;
        
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        // your code here
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value;
            front(node,1);
            return;
        }
        
        Node node = new Node(key, value);
        
        if(cache.size() == size){
            
            cache.remove(tail.key);
            remove(tail);
        }
        front(node,0);
        cache.put(key, node);
    }
    
    static void front(Node node, int flag){
        
        if(flag == 1) remove(node);
        
        node.next = head;
        node.prev = null;
        
        if(head != null)
            head.prev = node;
            head = node;
        
        if(tail == null)
            tail = node;
    }
    
    static void remove(Node node){
        Node prev_node = node.prev;
        Node next_node = node.next;
        
        if(prev_node!=null) prev_node.next = next_node;
        else head = next_node;
        
        if(next_node!=null) next_node.prev = prev_node;
        else tail = prev_node;
    }
}
class Node{
    
    int key, value;
    Node next, prev;
    
    Node(int key, int value){
        
        this.key = key;
        this.value = value;
    }
}

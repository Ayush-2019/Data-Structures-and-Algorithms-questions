public static Node findIntersection(Node h1, Node h2)
    {
        // code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        
        Node temp, begin = null, curr = null;
        while(h1!=null && h2!=null){
            if(h1.data<h2.data) h1 = h1.next;
            
            else if(h1.data>h2.data) h2 = h2.next;
            
            else if(!map.containsKey(h1.data)){
                temp = new Node(h1.data);
                if(begin == null) begin = temp;
                else curr.next = temp;
                curr = temp;
                map.put(h1.data,1);
                h1 = h1.next;
                h2 = h2.next;
            }
        }
        
        return begin;
    }

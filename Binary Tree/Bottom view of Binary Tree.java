class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    static void levelOrder(Node node , TreeMap<Integer , Integer> map){
        
        //Queue to store the node for level order
        Queue<Node> q1 = new LinkedList<Node>();
        
        //Queue to store vertical level value. ie. n = node , left = n-1 & right = n+1
        Queue<Integer> q2 = new LinkedList<Integer>();
        
        q1.add(node);
        q2.add(0);
        
        while( (!q1.isEmpty()) && (!q2.isEmpty()) ){
            
            Node temp = q1.peek();
            int temp1 = q2.peek();
            q1.remove() ;
            q2.remove();
            
            //cheking if it is already stored at particular index (ie. upper node), no need to store since it needs upper node
            if(!map.containsKey(temp1))
                map.put(temp1 , temp.data);
                
            else
                map.replace(temp1 , temp.data);
            
            if(temp.left != null){
                q1.add(temp.left);
                q2.add(temp1-1);
            }    
            
            if(temp.right != null){
                q1.add(temp.right);
                q2.add(temp1 + 1);
            }
        }
        
        return;  
    }
    
    // function should print the topView of the binary tree
    static ArrayList<Integer> bottomView(Node root)
    {
    // Code here
        //since TreeMap is same as HashMap and also it stores value in ascending order , therefore we dont need to sort it.
        TreeMap<Integer , Integer> map = new TreeMap<Integer , Integer>();
        
        levelOrder(root , map);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int x: map.keySet())
            ans.add(map.get(x));
            
        return ans;
        
        
    }
}

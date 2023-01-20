class Solution
{
    //Function to return the maximum sum of non-adjacent nodes.
    
    static HashMap<Node, Integer>map;
    
    static int grandchildren(Node node){
        
        int sum = 0;
        
        if(node.left != null) {
            sum += solve(node.left.left, map) + solve(node.left.right, map);
        }
        
        if(node.right != null){
            sum += solve(node.right.left, map) + solve(node.right.right, map);
        }
        
        return sum;
    }
    
    static int solve(Node node, HashMap<Node, Integer>map){
        
        if(node == null) return 0;
        
        if(map.containsKey(node)) return map.get(node);
        
        int inc = node.data + grandchildren(node);
        
        int exc = solve(node.left, map) + solve(node.right, map);
        
        map.put(node, Math.max(inc, exc));
        
        return Math.max(inc, exc);
    }
    
    static int getMaxSum(Node root)
    {
        // add your code here
        map = new HashMap<>();
        
        solve(root, map);
        
        return map.get(root);
    }
}

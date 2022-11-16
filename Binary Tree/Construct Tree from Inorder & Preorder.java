class Solution
{
    
    static int index = 0;
    
    public static Node solve(int in[], int pre[], int in_st, int in_end, int n, HashMap<Integer, Integer>map){
        
        if(index>=n || in_st>in_end) return null;
        
        int element = pre[index++];
        Node root = new Node(element);
        
        int pos = map.get(element);
        
        root.left = solve(in, pre, in_st, pos-1, n, map);
        root.right = solve(in, pre, pos+1, in_end, n, map);
        
        return root;
    }
    
    public static Node buildTree(int in[], int pre[], int n)
    {
        // code here
        index = 0;
        HashMap<Integer, Integer>map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(in[i], i);
        }
        Node ans = solve(in, pre, 0, n-1, n, map);
        
        return ans;
    }
}

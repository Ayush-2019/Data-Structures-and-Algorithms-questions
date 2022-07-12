class Solution {
    
    boolean isHeap(Node tree) {
        // code here
        Queue<Node>q = new LinkedList<>();
        q.add(tree);
        boolean flag = false;
        while(!q.isEmpty()){
            
            Node root = q.remove();
            
            if(root.left!=null){
                if(flag || root.data<root.left.data) return false;
                q.add(root.left);
            }
            else flag = true;
            
            if(root.right!=null){
                if(flag || root.data<root.right.data) return false;
                q.add(root.right);
            }
            else flag = true;
            
            
        }
        
        return true;
    }
}

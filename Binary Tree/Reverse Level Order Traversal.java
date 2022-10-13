

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<Node>q = new LinkedList();
        Stack<Integer>s = new Stack();
        q.add(root);
        
        while(!q.isEmpty()){
            Node curr = q.peek();
            
            if(curr.right!=null){
                q.add(curr.right);
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            
            s.add(curr.data);
            q.remove();
        }
        while(!s.isEmpty()){
            ans.add(s.peek());
            s.pop();
        }
        
        return ans;
    }
}      

//User function Template for Java

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
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.peek();
            ans.add(curr.data);
            if(curr.left!=null){
            q.add(curr.left);
            }
            if(curr.right!=null){
            q.add(curr.right);
            }
            q.remove();
        }
        return ans;
    }
}






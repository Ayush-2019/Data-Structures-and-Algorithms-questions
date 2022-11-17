/* A Binary Tree node
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
    boolean ans = true;
    
    int solve(Node root){
        
        if(root==null) return 0;
        if(root.left == null && root.right == null){
            return root.data;
        }
        
        int left = solve(root.left);
        int right = solve(root.right);
        
        if(root.data != left+right) ans = false;
        
        return left + right + root.data;
    }
    
	boolean isSumTree(Node root)
	{
             // Your code here
             ans = true;
             if(root == null) return true;
             
             solve(root);
             
             return ans;
	}
}

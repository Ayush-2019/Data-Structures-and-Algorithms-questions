//Recursive approach
class GFG
{
    
 

    public static void inorderRec(Node root)
    {
        if (root == null) {
            return;
        }
   
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
 
    public static void inorderIterative(Node root)
    {
        Stack<Node> stack = new Stack<>();
    
        Node curr = root;
    
        while (!stack.empty() || curr != null)
        {
           
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                System.out.print(curr.data + " ");
    
                curr = curr.right;
            }
        }
    }
}

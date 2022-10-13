class GFG
{
    public static void preorderRec(Node root)
    {
        if (root == null) {
            return;
        }
    
        System.out.print(root.data + " ");
   
        preorder(root.left);
    
        preorder(root.right);
    }
 
   public static void preorderIterative(Node root)
    {
        if (root == null) {
            return;
        }
    
        Stack<Node> stack = new Stack<>();
        stack.push(root);
    
        while (!stack.empty())
        {
            Node curr = stack.pop();
    
            System.out.print(curr.data + " ");
    
            if (curr.right != null) {
                stack.push(curr.right);
            }
    
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
        }
    }
}

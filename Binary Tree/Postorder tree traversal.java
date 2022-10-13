class GFG
{
    public static void postorderRec(Node root)
    {
        if (root == null) {
            return;
        }
    
        postorder(root.left);
    
        postorder(root.right);
    
        System.out.print(root.data + " ");
    }
 
    public static void postorderIterative(Node root)
    {
        if (root == null) {
            return;
        }
 
        Stack<Node> stack = new Stack<>();
        stack.push(root);
    
        Stack<Integer> out = new Stack<>();
    
        while (!stack.empty())
        {
            Node curr = stack.pop();
            out.push(curr.data);
    
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
    
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }
    }
}

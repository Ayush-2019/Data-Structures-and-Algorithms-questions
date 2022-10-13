// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
    int ma;
    
    int calc(Node root){
        //main code here
        if(root==null){
            return 0;
        }
        
        int x = calc(root.left);
        int y = calc(root.right);
        ma = Math.max(ma,x+y+1);
        return (Math.max(x,y)+1);
    }
    int diameter(Node root) {
        // Your code here
         ma = Integer.MIN_VALUE;
        calc(root);
        return ma;
    }
}

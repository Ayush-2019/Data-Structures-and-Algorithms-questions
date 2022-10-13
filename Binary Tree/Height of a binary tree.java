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

class Solution {
    //Function to find the height of a binary tree.
    /*int height(Node root){
        // code here 
        if(root==null){
            return 0;
        }
        
        int ans=1;
        Node curr = root;
        while(curr.left!=null || curr.right!=null){
            if(curr.left==null){
                curr=curr.right;
            }
            else if(curr.right==null){
                curr=curr.left;
            }
            else{
                curr=curr.left;
            }
            ans++;
        }
        return ans;
    }*/
    
    int height(Node root){
        if(root==null)
        return 0;
        return 1+Math.max(height(root.left),height(root.right));
        
    }
}

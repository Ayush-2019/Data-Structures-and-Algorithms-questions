class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      if(root==null){
      return ans;}
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      
      while(!q.isEmpty()){
          Node add = q.peek();
          ans.add(add.data);
          
          int size = q.size();
          while(size>0){
              Node curr = q.remove();
              if(curr.left!=null){
                  q.add(curr.left);
              }
              if(curr.right!=null){
                  q.add(curr.right);
              }
              size--;
          }
      }
      return ans;
    }
}

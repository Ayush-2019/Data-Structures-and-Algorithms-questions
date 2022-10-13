class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        //add code here.
        ArrayList<Integer> ans = new ArrayList<>();
      if(root==null){
      return ans;}
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      
      while(!q.isEmpty()){
          ans.add(q.peek().data);
          
          int size = q.size();
          
          while(size>0){
              Node curr = q.remove();
              
              if(curr.right!=null) q.add(curr.right);
              
              if(curr.left!=null) q.add(curr.left);
              
              size--;
          }
      }
      return ans;
    }
}

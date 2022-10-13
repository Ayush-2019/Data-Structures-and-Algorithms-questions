class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> ans = new ArrayList<Integer>();
           Queue<Node> q = new LinkedList<Node>();
           
           q.add(root);
           Node curr;
           while(!q.isEmpty()){
               curr = q.remove();
               while(curr!=null){
                   ans.add(curr.data);
                   if(curr.left!=null){
                       q.add(curr.left);
                   }
                       curr=curr.right;
               }
           }
           return ans;
      }
}

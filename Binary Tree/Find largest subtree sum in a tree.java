class Solution{
  
  int ans = Math.MIN_VALUE;
  
  static int solve(Node root)
{
    
    if (root == null)    
        return 0;
     
    int currSum = root.key +
    findLargestSubtreeSumUtil(root.left, ans) +
    findLargestSubtreeSumUtil(root.right, ans);
 
    ans = Math.max(ans, currSum);
 
    return currSum;
  }
  
  static int findLargestSubtreeSum(Node root){
    ans = Math.MIN_VALUE;
    
    solve(root);
    
    return ans;
  }
}

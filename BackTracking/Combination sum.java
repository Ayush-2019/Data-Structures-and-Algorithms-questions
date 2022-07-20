class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    
    static void solve(ArrayList<Integer>A, int sum, ArrayList<ArrayList<Integer>>ans, ArrayList<Integer>temp, int curr_sum, int index){
        
        if(curr_sum == sum){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        
        
        if(curr_sum>sum) return;
        
        if(index == A.size()) return;
        
        temp.add(A.get(index));
        solve(A, sum, ans, temp, curr_sum+A.get(index), index);
            
        temp.remove(temp.size()-1);
        solve(A, sum, ans, temp, curr_sum, index+1);
            
    }
    
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int sum)
    {
        // add your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        Collections.sort(A);
        
        int i=1;
        while(i<A.size()){
            if(A.get(i) == A.get(i-1)) A.remove(i);
            
            else i++;
        }
        
        solve(A, sum, ans, temp, 0, 0);
        
        return ans;
    }
}

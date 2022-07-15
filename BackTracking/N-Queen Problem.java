class Solution{
    
    static void solve(boolean cols[], boolean left[], boolean right[], int n, int row, ArrayList<Integer>sol, ArrayList<ArrayList<Integer>>ans){
        
        if(row == n){
            ans.add(new ArrayList<>(sol));
            return;
        }
        
        for(int col=0;col<n;col++){
            
            if(cols[col] || left[row+col] || right[row-col+n]) continue;
            
            cols[col] = left[row+col] = right[row-col+n] = true;
            sol.add(col+1);
            
            solve(cols, left, right, n, row+1, sol, ans);
            
            sol.remove(sol.size()-1);
            cols[col] = left[row+col] = right[row-col+n] = false;
            
        }
    }
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        
        ArrayList<Integer>sol = new ArrayList<>();
        
        boolean cols[] = new boolean[n];
        boolean left[] = new boolean[2*n];
        boolean right[] = new boolean[2*n];
        
        solve(cols, left, right, n, 0, sol, ans);
        
        return ans;
    }
}

class Solution{
    
    static boolean solve(String wild, String pat, int n, int m, int i, int j){
        if(i==n && j == m) return true;
        
        else if(j == m){
            for(int p=i;p<n;p++){
                if(wild.charAt(p) != '*') return false;
            }
            return true;
        }
        
        else if((i!=n && j == m) || (i==n && j != m)) return false;
        
        else if(wild.charAt(i) == pat.charAt(j)) return solve(wild, pat, n, m, i+1, j+1);
        
        else if(wild.charAt(i) != '*' && wild.charAt(i) != '?' && wild.charAt(i) != pat.charAt(j)) return false;
        
        else if(wild.charAt(i) == '?'){
            return solve(wild, pat, n, m, i+1, j+1);
        }
        else{
            boolean res = false;
            
            for(int k=0;k<=m-j;k++){
                res = res | solve(wild, pat, n, m, i+1, j+k);
            }
            
            return res;
        }
        //return false;
    }
    
    static boolean match(String wild, String pat)
    {
        // code here
        int n = wild.length(), m = pat.length();
        
        return solve(wild, pat, n, m, 0, 0);
    }
}

class Solution{
    
    static boolean isPresent(String temp, List<String> dict, int n){
        
        for(int i=0;i<n;i++){
            if(dict.get(i).equals(temp)) return true;
        }
        return false;
    }
    
    static void solve(int n, List<String> dict, String s, String sub, List<String> ans){
        if(s.length() == 0){
            ans.add(sub);
            return;
        }
        
        String temp = "";
        for(int i=0;i<s.length();i++){
            
            temp += s.charAt(i);
            
            if(isPresent(temp, dict, n)){
                
                if(sub == ""){
                    solve(n, dict, s.substring(i+1), temp, ans);
                }
                
                else solve(n, dict, s.substring(i+1), sub+" "+temp, ans);
            }
        }
    }
    
    
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        // code here
        List<String> ans = new ArrayList<String>();
        
        solve(n, dict, s, "", ans);
        
        return ans;
    }
}

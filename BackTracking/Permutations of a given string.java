class Solution {
    
    public String swap(String s, int i, int index){
        char x = s.charAt(i), y = s.charAt(index);
        
        s = s.substring(0, index) + x + s.substring(index + 1);

        s = s.substring(0, i) + y + s.substring(i + 1);
        
        return s;
        
    }
    
    
    public void solve(String s, List<String> ans,int index){
        
        if(index == s.length()){
            if(!ans.contains(s)){
            ans.add(s);
            }
            return;
        }
        
        for(int i = index;i<s.length();i++){
            s = swap(s,i,index);
            solve(s,ans,index+1);
            s = swap(s,i,index);
        }
    }
    public List<String> find_permutation(String s) {
        // Code here
        List<String>ans = new ArrayList<>();
        
        solve(s,ans,0);
        Collections.sort(ans);
        return ans;
        
    }
}

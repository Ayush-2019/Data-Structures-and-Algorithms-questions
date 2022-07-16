class Solution {
    
    static boolean isPalin(String sub){
        int i=0, j=sub.length()-1;
        
        while(i<j){
            if(sub.charAt(i)!=sub.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
    static void solve(ArrayList<ArrayList<String>>ans, ArrayList<String>temp, String str){
        if(str.length() == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<str.length();i++){
            
            String sub = str.substring(0, i+1);
            
            if(isPalin(sub)){
                temp.add(sub);
                
                String rem = str.substring(i+1);
                solve(ans, temp, rem);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    static ArrayList<ArrayList<String>> allPalindromicPerms(String str) {
        // code here
        ArrayList<ArrayList<String>>ans = new ArrayList<>();
        ArrayList<String>temp = new ArrayList<String>();
        
        solve(ans, temp, str);
        return ans;
    }
};

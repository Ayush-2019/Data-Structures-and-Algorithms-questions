class Solution{
    
    public String removeChar(String s, int i, int n){
        
        if(i >= n) return s;
        
        if(s.charAt(i) == s.charAt(i-1)){
            if(i == n-1) s = s.substring(0, i);
           
            else s = s.substring(0, i) + s.substring(i+1, n);
            return removeChar(s, i, n-1);
        }
        
        return removeChar(s, i+1, n);
        
    }
    
    public String removeConsecutiveCharacter(String s){
        
        int n = s.length();
        
        return removeChar(s, 1, n);
        
    }
}

class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> st = new Stack<Character>();
        
        for(char i:S.toCharArray()) st.push(i);
        
        String ans = "";
        
        for(int i=0;i<S.length();i++) ans += st.pop();
        
        return ans;
        
    }

}

// Approach with T.C. = O(N) an S.C. = O(N)

class Solution {
    static int findMaxLen(String S) {
        // code here
        Stack<Integer>st = new Stack<Integer>();
        
        int ans = 0;
        st.push(-1);
        
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            
            if(c == '(') st.push(i);
            
            else{
                if(!st.isEmpty())
                    st.pop();
                    
                    if(!st.isEmpty()) ans = Math.max(ans, i-st.peek());
                    
                    else st.push(i);
                }
                
            }
        
        return ans;
    }
};

//Approach with T.C. = O(N) and S.C. = O(1)

class Solution {
    static int findMaxLen(String S) {
        // code here
        int ans = 0;
        int open = 0, close = 0;
        
        for(int i=0;i<S.length();i++){
            
            char c = S.charAt(i);
            
            if(c == ')'){
                close++;
            }
            
            else if(c == '(') open++;
            
            if(open == close){
                ans = Math.max(ans, open);
            }
            if(close>open){
                open = 0;
                close = 0;
            }
            
        }
        
        open=0;
        close=0;
        
        for(int i=S.length()-1;i>=0;i--){
            
            char c = S.charAt(i);
            
            if(c == ')'){
                close++;
            }
            
            else if(c == '(') open++;
            
            if(open == close){
                ans = Math.max(ans, open);
            }
            if(open>close){
                open = 0;
                close = 0;
            }
            
        }
        
        return ans * 2;
    }
};

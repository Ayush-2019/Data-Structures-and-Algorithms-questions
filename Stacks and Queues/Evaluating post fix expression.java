class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer>s = new Stack<Integer>();
        int ans = 0;
        
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c >='0' && c<='9') s.push(c - '0');
            
            else if(!s.isEmpty()){
                int a = s.pop();
                int b = s.pop();
                if(c == '+') ans = a+b;
                else if(c == '-') ans = b-a;
                else if(c == '*') ans = a*b;
                else if(c == '/') ans = b/a;
                s.push(ans);
            }
        }
        return ans;
    }
}

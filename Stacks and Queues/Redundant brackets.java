import java.util.*;

public class Solution 
{
    public static boolean findRedundantBrackets(String s) 
    {
        // Write your code here.
        Stack<Character>st = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            
            if(c == ')'){
                boolean check = true;
                char top = st.pop();
                while(top!='('){
                   
                    if(top == '+' || top=='-' || top=='*' || top=='/') check = false;
                    top = st.pop();
                    
                }
                
                if(check == true) return true;
            }
            else st.push(c);
        }
        
        return false;
    }
}

import java.util.Stack;

public class Solution {
    
    public static void put_bottom(Stack<Integer>s, int c){
        if(s.isEmpty()) s.push(c);
        
        else{
            int p = s.peek();
            s.pop();
                put_bottom(s,c);
            s.push(p);
        }
    }
    
	public static void reverseStack(Stack<Integer> s) {
		// write your code here
        
        if(s.isEmpty()) return;
        
        else{ 
            int c = s.peek();
            s.pop();
            reverseStack(s);
            put_bottom(s,c);
        }
        
		
	}

}

class GfG{
    
    public void stack_sort(Stack<Integer>s, int c){
        if(s.isEmpty() || s.peek() <=c) s.push(c);
        
        else{
            int p = s.pop();
            stack_sort(s,c);
            s.push(p);
        }
    }
    
    public void reverse(Stack<Integer>s){
        
        if(s.size()>1){
		    int c = s.pop();
		    reverse(s);
		    
		    stack_sort(s,c);
    }
    }
    
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		
		reverse(s);
		return s;
		}
	}

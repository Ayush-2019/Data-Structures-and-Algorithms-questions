class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   while(!s1.isEmpty()){
	       
	       s2.push(s1.pop());
	   }
	   s1.push(x);
	   
	   while(!s2.isEmpty()){
	       
	       s1.push(s2.pop());
	   }
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   return !s1.isEmpty()?s1.pop():-1;
    }
}

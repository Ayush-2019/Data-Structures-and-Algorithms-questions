// Using 2 queues

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q1.add(a);
	    
	    while(!q2.isEmpty()){
	        q1.add(q2.remove());
	    }
	    int x = q2.size();
	    
	    while(!q2.isEmpty()){
	        q2.remove();
	        
	    }
	    while(!q1.isEmpty()){
	        q2.add(q1.remove());
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(!q2.isEmpty()){
	    return q2.remove();
	    }
	    return -1;
    }
	
}

//Using 1 queue

class Queues
{
    Queue<Integer> q = new LinkedList<Integer>();
    
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    q.add(a);
	    int x = q.size()-1;
	    
	    while(x>0){
	        q.add(q.remove());
	        x--;
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    return !q.isEmpty()?q.remove():-1;
    }
	
}



class CircularQueue{
  
  int n;
  int arr[];
  int front = -1, rear = -1;
  
  public CircularQueue(int n){
   this.n = n; 
    arr = new int[n];
  }
  
  void enqueue(int item){
   if((rear+1)%n == front) return;
    
    if(front == -1) front = 0;
    
    rear = (rear+1)%n;
    arr[rear] = item;
  }
  
  int dequeue(){
   
    if(front == -1) throw new ArithmeticException(" Queue is empty");
    
    int ans = arr[front];
    
    if(front == rear){
     front = -1;
      rear = -1;
    }
    else{
     front = (front+1)%n; 
    }
    return ans;
  }
}

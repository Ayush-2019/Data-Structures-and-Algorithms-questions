class Solution
{
    //Function to insert heap.
    
    public static PriorityQueue<Integer>max = new PriorityQueue<>((a,b) -> b-a);
    public static PriorityQueue<Integer>min = new PriorityQueue<>();
    
    public static void insertHeap(int x)
    {
        // add your code here
        int l = max.size();
        int r = min.size();
        
        if(l == 0) max.add(x);
        
        else if(r==0){
            if(max.peek()<x) min.add(x);
            
            else{
                int temp = max.peek();
                max.poll();
                max.add(x);
                min.add(temp);
            }
        }
        
        else if(l == r){
            
            if(x<min.peek()) max.add(x);
            
            else{
                int temp = min.peek();
                min.poll();
                min.add(x);
                max.add(temp);
            }
        }
        
        else{
            if(x<min.peek()){
                if(x<max.peek()){
                    int temp = max.peek();
                    max.poll();
                    max.add(x);
                    min.add(temp);
                }
                else{
                    min.add(x);
                }
                
            }
            
            else{
                min.add(x);
            }
        }
    }
    
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(max.size()>min.size()) return (double)max.peek();
        else return (double)((max.peek()+min.peek())/2);
    }
    
}

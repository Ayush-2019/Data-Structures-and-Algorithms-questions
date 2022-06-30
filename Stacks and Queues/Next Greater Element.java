class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Integer> s = new Stack<Integer>();
        
        long ans[] = new long[n];
        
        s.push(0);
        
        int i=1;
        
        while(i<n){
            if(s.isEmpty()){
                s.push(i);
            }
            else if(arr[i]<=arr[s.peek()]){
                s.push(i);
                i++;
            }
            else{
                ans[s.pop()] = arr[i];
        }
    }
    
        while(!s.isEmpty()){
            ans[s.pop()] = -1;
        }
        return ans;
    }
}

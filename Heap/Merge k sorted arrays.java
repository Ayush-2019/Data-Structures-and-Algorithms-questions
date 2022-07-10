class Solution
{
    //Function to merge k sorted arrays.
    
    static void buildHeap(ArrayList<Integer> arr, int n)
    {
        // Your code here
        int start = (n/2) - 1;
        
        for(int i = start;i>=0;i--){
            
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    static void heapify(ArrayList<Integer> arr, int n, int i)
    {
        // Your code here
        int root = i;
        int left = (2*i)+1, right = (2*i)+2;
        
        if(left<n && arr.get(left)>arr.get(root)) root = left;
        if(right<n && arr.get(right)>arr.get(root))  root = right;
        
        if(root!=i){
        int temp = arr.get(i);
        arr.set(i,arr.get(root));
        arr.set(root,temp);
        
        heapify(arr,n,root);
        }
    }
    
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer>ans = new ArrayList<Integer>();
        
        for(int i=0;i<K;i++){
            for(int j=0;j<K;j++){
                ans.add(arr[i][j]);
            }
        }
        int n = K*K;
        buildHeap(ans,n);
        
        for(int i=n-1;i>=0;i--){
            
            int temp = ans.get(i);
            ans.set(i,ans.get(0));
            ans.set(0,temp);
            
            heapify(ans,i,0);
        }
        
        return ans;
        
    }
}

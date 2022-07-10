class Solution {
    
     
       
    static void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
  
        // If left child is larger than root
        if (l < n && arr[l] < arr[largest])
            largest = l;
  
        // If right child is larger than largest so far
        if (r < n && arr[r] < arr[largest])
            largest = r;
  
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
  
    // Function to build a Max-Heap from the Array
    static void buildHeap(int arr[], int n)
    {
        // Index of last non-leaf node
        int startIdx = (n / 2) - 1;
  
        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        
        int ans[] = new int[k];
        
        for(int i=0;i<k;i++){
            ans[i] = arr[i];
        }
        
        buildHeap(ans, k);
        
        for(int i=k;i<n;i++){
            
            if(arr[i]>ans[0]){
                ans[0] = arr[i];
                
                heapify(ans,k,0);
            }
        }
        
        Arrays.sort(ans);
        
        int i=0,j=k-1;
        while(i<j){
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        
        return ans;
        
    }
}

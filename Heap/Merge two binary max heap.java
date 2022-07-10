class Solution{
    
    static void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2;
  
        
        if (l < n && arr[l] > arr[largest])
            largest = l;
  
       
        if (r < n && arr[r] > arr[largest])
            largest = r;
  
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
            
            heapify(arr, n, largest);
        }
    }
  
    
    static void buildHeap(int arr[], int n)
    {
        
        int startIdx = (n / 2) - 1;
  
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        int arr[] = new int[n+m];
        
        for(int i=0;i<n;i++) arr[i] = a[i];
        for(int i=0;i<m;i++) arr[i+n] = b[i];
        
        buildHeap(arr,n+m);
        
        return arr;
    }
}

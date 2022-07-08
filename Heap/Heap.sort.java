class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        int start = (n/2) - 1;
        
        for(int i = start;i>=0;i--){
            
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int root = i;
        int left = (2*i)+1, right = (2*i)+2;
        
        if(left<n && arr[left]>arr[root]) root = left;
        if(right<n && arr[right]>arr[root])  root = right;
        
        if(root!=i){
        int temp = arr[i];
        arr[i] = arr[root];
        arr[root] = temp;
        
        heapify(arr,n,root);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
 }
 
 

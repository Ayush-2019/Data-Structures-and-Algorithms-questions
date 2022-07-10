class Solution{
    
    public static int part(int arr[], int low, int high){
        
        int pivot = arr[high];
        
        int i = low-1;
        
        for(int j=low;j<high;j++){
            
            if(arr[j]<pivot){
               
               i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
                arr[i+1] = arr[high];
                arr[high] = temp;
                
                return i+1;
    }
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int partition = part(arr,l,r);
        
        if(partition == k-1) return arr[partition];
        
        else if(partition<k-1) return kthSmallest(arr, partition+1,r,k);
        
        else return kthSmallest(arr,l,partition-1,k);
        
        
    } 
}

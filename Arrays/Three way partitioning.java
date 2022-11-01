class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void threeWayPartition(int arr[], int a, int b)
    {
        //code here 
        int i=0, j=1, n = arr.length;
        
        //Less than a
        
        while(i<n && arr[i] < a) i++;
        j = i+1;
        
        while(j<n){
            if(arr[j] < a){
                swap(arr, i, j);
                i++;
            }
            j++;
        }
        
        //Between a and b
        
        while(i<n && arr[i] >= a && arr[i] <= b) i++;
        
        j = i+1;
        
        while(j<n){
            if(arr[j] >= a && arr[j] <= b){
                swap(arr, i, j);
                i++;
            }
            j++;
        }
      
//       Another Approach
        
//       int l=0,mid=0,r=arr.length-1;

//         while(mid<=r)

//         {

//             if(arr[mid]>b)

//                 swap(arr, mid,r--);

//             if(arr[mid]<a)

//                 swap(arr, l++,mid++);

//             else if(arr[mid]>=a && arr[mid]<=b)

//                 mid++;

//         }
    
    
}
}

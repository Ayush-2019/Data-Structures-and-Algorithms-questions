class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    
    static long merge(long arr[], int l, int m, int r)
    {
        long swaps = 0;
  
        int n1 = m - l + 1;
        int n2 = r - m;
 
        
        long L[] = new long[n1];
        long R[] = new long[n2];
 
        
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        
        int i = 0, j = 0;
 
       
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                swaps += (m+1) - (l+i);
                j++;
            }
            k++;
        }
 
        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        
        return swaps;
    }
    
    static long mergeSort(long arr[], int l, int r)
    {
        long inv = 0;
        
        if (l < r) {
            int m =l+ (r-l)/2;
 
            inv += mergeSort(arr, l, m);
            inv += mergeSort(arr, m + 1, r);
          
            inv += merge(arr, l, m, r);
        }
        return inv;
    }
    
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int n = (int)N;
        
        return mergeSort(arr, 0, n-1);
    }
}

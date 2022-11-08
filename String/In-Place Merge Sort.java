//Approach 1:- TC:- O(n2logn)

public class GFG {
  
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    // Inplace Implementation
    static void merge(int arr[], int start, int mid,
                      int end)
    {
        int start2 = mid + 1;
  
        // If the direct merge is already sorted
        if (arr[mid] <= arr[start2]) {
            return;
        }
  
        // Two pointers to maintain start
        // of both arrays to merge
        while (start <= mid && start2 <= end) {
  
            // If element 1 is in right place
            if (arr[start] <= arr[start2]) {
                start++;
            }
            else {
                int value = arr[start2];
                int index = start2;
  
                // Shift all the elements between element 1
                // element 2, right by 1.
                while (index != start) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[start] = value;
  
                // Update all the pointers
                start++;
                mid++;
                start2++;
            }
        }
    }
  
    /* l is for left index and r is right index of the
       sub-array of arr to be sorted */
    static void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
  
            // Same as (l + r) / 2, but avoids overflow
            // for large l and r
            int m = l + (r - l) / 2;
  
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
  
            merge(arr, l, m, r);
        }
    }
  
  //Approach 2 :- TC:- O(nlogn * logn)
  
  private static int nextGap(int gap)
    {
        if (gap <= 1)
            return 0;
        return (int)Math.ceil(gap / 2.0);
    }
  
    // Function for swapping
    private static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
  
    // Merging the subarrays using shell sorting
    // Time Complexity: O(nlog n)
    // Space Complexity: O(1)
    private static void inPlaceMerge(int[] nums, int start,
                                     int end)
    {
        int gap = end - start + 1;
        for (gap = nextGap(gap); gap > 0;
             gap = nextGap(gap)) {
            for (int i = start; i + gap <= end; i++) {
                int j = i + gap;
                if (nums[i] > nums[j])
                    swap(nums, i, j);
            }
        }
    }
  
    // merge sort makes log n recursive calls
    // and each time calls merge()
    // which takes nlog n steps
    // Time Complexity: O(n*log n + 2((n/2)*log(n/2)) +
    // 4((n/4)*log(n/4)) +.....+ 1)
    // Time Complexity: O(logn*(n*log n))
    // i.e. O(n*(logn)^2)
    // Space Complexity: O(1)
    private static void mergeSort(int[] nums, int s, int e)
    {
        if (s == e)
            return;
  
        // Calculating mid to slice the
        // array in two halves
        int mid = (s + e) / 2;
  
        // Recursive calls to sort left
        // and right subarrays
        mergeSort(nums, s, mid);
        mergeSort(nums, mid + 1, e);
        inPlaceMerge(nums, s, e);
    }
  
}

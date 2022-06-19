class Solution {

    public void merge(int arr1[], int arr2[], int m, int n) {
        // code here
        int i=m-1, j=0;
        
        while(i>=0 && j<n){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                j++;
            }
            
            else i--;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       
    }
}

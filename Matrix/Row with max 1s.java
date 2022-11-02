class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int pos = arr[0][m-1];
        
        int ones = 0, ans = -1;
        int i=0, j=m-1;
        
        while(i<n && j>=0){
            
            pos = arr[i][j];
            
            if(pos == 1){
                ones++;
                ans = i;
                j--;
            }
            
            else{
                i++;
            }
        }
        
        return ans;
    }
}

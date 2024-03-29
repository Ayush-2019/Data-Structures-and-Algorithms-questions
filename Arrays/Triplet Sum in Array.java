class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       
       int l, r;
       
       Arrays.sort(A);
       
       for(int i=0;i<n;i++){
           
           l = i+1;
           r = n-1;
           
           while(l<r){
               
               if(A[i] + A[l] + A[r] == X) return true;
               
               else if(A[i] + A[l] + A[r] < X) l++;
               
               else r--;
           }
       }
       
       return false;
    
    }
}

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        int i=0, j=0, k=0;
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        while(i<n1 && j<n2 && k<n3){
            
            if(A[i] == B[j] && B[j] == C[k]){
                
                if(ans.indexOf(A[i]) == -1) ans.add(A[i]);
                
                i++;
                j++;
                k++;
            }
            
            else if(A[i] <B[j]) i++;
            
            else if(B[j]<C[k]) j++;
            
            else k++;
        }
        
        return ans;
    }
}

// Another Approach cpp(imp)
  
// class Solution
// {
//     public:    
//        vector <int> commonElements (int A[], int B[], int C[], int n1, int n2, int n3)
//         {
//             //code here.
//             vector<int> res;
        
//         int i = 0, j = 0, k = 0;
        
//         while(i < n1 and j < n2 and k < n3)
//         {
//             while(i > 0 and i < n1 and A[i - 1] == A[i])
//             {
//                 i++;
//             }
            
//             while(j > 0 and j < n2 and B[j - 1] == B[j])
//             {
//                 j++;
//             }
            
//             while(k > 0 and k < n3 and C[k - 1] == C[k])
//             {
//                 k++;
//             }
            
//             if(i < n1 and j < n2 and k < n3)
//             {
//                 if(A[i] == B[j] and B[j] == C[k])
//                 {
//                     res.push_back(A[i]);
                    
//                     i++;
//                     j++;
//                     k++;
//                 }
//                 else if(A[i] < B[j])
//                 {
//                     i++;
//                 }
//                 else if(B[j] < C[k])
//                 {
//                     j++;
//                 }
//                 else
//                 {
//                     k++;
//                 }
//             }
//         }
        
//         return res;
//         }

// };

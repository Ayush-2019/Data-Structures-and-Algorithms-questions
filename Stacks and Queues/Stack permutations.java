class Solution {
    public static int isStackPermutation(int N, int[] A, int[] B) {
        // code here
        Stack<Integer>st = new Stack<Integer>();
        
        int ans = 0;
        int a = A.length, b = B.length, check = 0;
        
        for(int i=0;i<a;i++){
            
            st.push(A[i]);
            
            while(!st.isEmpty()){
                int c = st.peek();
                
                if(c == B[check]){
                    st.pop();
                    check++;
                }
                
                else break;
            }
            if(check == b) return 1;
        }
        return 0;
    }
}
        

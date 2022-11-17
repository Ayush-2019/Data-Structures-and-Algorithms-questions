class Solution {
    
    public static int index = 0;
    
    public static void getInorder(int A[], int in[], int i, int n){
        
        if(i>=n) return;
        
        getInorder(A, in, 2*i+1, n);
        
        in[index++] = A[i];
        
        getInorder(A, in, 2*i+2, n);
        
    }
    
    public static int minSwaps(int n, int[] A) {
        // code here
        index = 0;
        
        int in[] = new int[n];
        int sorted[] = new int[n];
        
        HashMap<Integer, Integer>map = new HashMap<>();
        
        getInorder(A, in, 0, n);
        
        for(int i=0;i<n;i++){
            sorted[i] = in[i];
            map.put(in[i], i);
        }
        
        Arrays.sort(sorted);
        
        int swaps = 0;
        
        for(int i=0;i<n;i++){
            if(sorted[i] != in[i]){
                swaps++;
                
                int ind = map.get(sorted[i]);
                
                int temp = in[i];
                in[i] = in[ind];
                in[ind] = temp;
                
                map.put(in[i], i);
                map.put(in[ind], ind);
            }
        }
        
        return swaps;
    }
}
        

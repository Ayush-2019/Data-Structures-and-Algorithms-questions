class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        // code here
        
        HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        
        for(int i=0;i<A.length;i+=2){
            
            if(map.containsKey(A[i])){
                map.get(A[i]).push(A[i+1]);
            }
            
            else{
                Stack<Integer> st = new Stack<>();
                
                st.push(A[i+1]);
                
                map.put(A[i],st);
            }
        }
        
        int i=0;
        
        for(int k : map.keySet()){
            while(i<B.length && B[i] == k){
                if(map.get(k).isEmpty() || map.get(k).pop() != B[i+1]) return 0;
                i+=2;
            }
        }
            
            return 1;
    }
};

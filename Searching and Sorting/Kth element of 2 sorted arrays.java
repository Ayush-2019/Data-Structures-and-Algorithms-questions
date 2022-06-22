class Solution {
    public long kthElement( int arr1[], int arr2[], int m, int n, int k) {
        
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            ans.add(arr1[i]);
        }
        for(int i=0;i<n;i++){
            ans.add(arr2[i]);
        }
        Collections.sort(ans);
        return ans.get(k-1);
    }
}

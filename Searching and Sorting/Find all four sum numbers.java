class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        
        Set<ArrayList<Integer>>set = new LinkedHashSet<ArrayList<Integer>>();
        
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l = j+1, r = n-1;
                
                while(l<r){
                    if(arr[i]+arr[j]+arr[l]+arr[r] == k){
                        ArrayList<Integer>list = new ArrayList<Integer>();
                        
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
                        set.add(list);
                        l++;
                    }
                    else if(arr[i]+arr[j]+arr[l]+arr[r] > k) r--;
                    else l++;
                }
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(set);
        
        return ans;
    }
}

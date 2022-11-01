class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        long ans = Integer.MAX_VALUE;
        
        int i = 0,j = m-1;
        
        while(j<n){
            
            long curr = a.get(j) - a.get(i);
            
            ans = Math.min(ans, curr);
            i++;
            j++;
            
        }
        
        return ans;
    }
}

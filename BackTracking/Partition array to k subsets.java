class Solution
{
    
    public boolean solve(int a[], int n, int k, boolean taken[], int sum, int curr_sum){
        
        if(k == 0) return true;
        
        if(curr_sum>sum) return false;
        
        if(curr_sum == sum) return solve(a, n, k-1, taken, sum, 0);
        
        for(int i=0;i<n;i++){
            if(taken[i]) continue;
            taken[i] = true;
            if(solve(a, n, k, taken, sum, curr_sum+a[i])) return true;
            taken[i] = false;
        }
        
        return false;
    }
    
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	// Your code here
	if(n<k) return false;
	
	int total = 0;
	for(int i=0;i<n;i++) total+=a[i];
	
	if(total%k!=0) return false;
	
	int sum = total/k;
	boolean taken[] = new boolean[n];
	
	return solve(a, n, k, taken, sum, 0);
    }
}

class Solution
{
    long countTriplets(long arr[], int n,int k)
    {
        Arrays.sort(arr);
        long ans = 0;
        
        for(int i=0;i<n-2;i++){
            
                int l = i+1, r = n-1;
                
                while(l<r){
                    if(arr[i]+arr[l]+arr[r] < k){
                        
                        ans += r-l;
                        l++;
                    }
                    else r--;
            }
        }
        
        
        return ans;

    }
}

class Solution{
  
  public:
    int maxSubarraySum(int arr[], int n){
        long long max_end=0,max_far=INT_MIN;
        for(int i=0;i<n;i++){
            max_end+=arr[i];
                max_far=max(max_end,max_far);
            if(max_end<0){
                max_end=0;
            }
        }
        // Your code here
        return max_far;
    }
  
};

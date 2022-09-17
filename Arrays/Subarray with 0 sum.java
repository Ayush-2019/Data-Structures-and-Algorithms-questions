class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        
        HashMap<Integer,Boolean> map = new HashMap<>();

        int sum = 0;
    
        map.put(sum,true);
    
        for(int i=0;i<n;i++){
    
            sum+=arr[i];
    
            
    
            if(map.containsKey(sum)) return true;
    
    
                map.put(sum,true);
    
            }
    
        return false;
    }
}

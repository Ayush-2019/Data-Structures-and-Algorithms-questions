class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        
        int count = n/k, ans = 0;
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            
            else{
                if(map.get(arr[i]) == count){
                    ans++;
                }
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        
        return ans;
    }
}

class Solution
{
    int transform (String A, String B)
    {
        // code here
        int n = A.length(), m = B.length();
        
        if(n!=m) return -1;
        
        int hashA = 0, hashB = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(B.charAt(i));
            hashA += A.charAt(i);
            hashB += B.charAt(i);
        }
        
        for(int i=0;i<n;i++){
            if(!set.contains(A.charAt(i))){
                return -1;
            }
        }
        
        if(hashA != hashB) return -1;
        
        
        int ans = 0, i = n-1, j = m-1;
        
        while(i>=0){
            if(A.charAt(i) == B.charAt(j)){
                i--;
                j--;
            }
            
            else{
                ans++;
                i--;
            }
        }
        
        return ans;
    }
}

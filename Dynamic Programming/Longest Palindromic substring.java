class Solution{
    String longestPalindrome(String s){
        // code here
        
        int n = s.length();
        
        int start = 0, end = 1;
        
        for(int i=1;i<n;i++){
            
             //code for even case
            
            int low = i-1, high = i;
            
           
            
            while(low>=0 && high<n && s.charAt(low) == s.charAt(high)){
                
                if(high-low+1 > end){
                    
                    start = low;
                    end = high-low+1;
                }
                
                low--;
                high++;
            }
            
            // code for odd case
            
             low = i-1;
            high = i+1;
            
            while(low>=0 && high<n && s.charAt(low) == s.charAt(high)){
                
                if(high-low+1 > end){
                    
                    start = low;
                    end = high-low+1;
                }
                
                low--;
                high++;
            }
        }
        
        return s.substring(start, end+start);
    }
}

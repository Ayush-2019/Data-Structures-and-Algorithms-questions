class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        HashMap<Character, Integer> freq = new HashMap<>();
        
        HashMap<Character, Integer> check = new HashMap<>();
        
        int n = s.length(), m = p.length(), chars = 0;
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<m;i++){
            freq.put(p.charAt(i), freq.getOrDefault(p.charAt(i),0)+1);
            chars++;
        }
        int i=0, count = 0, minw = Integer.MAX_VALUE, total = 0;
        
        for(int j=0;j<n;j++){
            
            if(freq.containsKey(s.charAt(j))){
                check.put(s.charAt(j), check.getOrDefault(s.charAt(j), 0)+1);
                
                if(check.get(s.charAt(j)) <= freq.get(s.charAt(j))){
                    count++;
                }
            }
            total++;
            
            while(i<j){
                if(freq.containsKey(s.charAt(i)) && check.get(s.charAt(i)) > freq.get(s.charAt(i))){
                    check.put(s.charAt(i), check.get(s.charAt(i))-1);
                    total--;
                    i++;
                    
                }
                else if(!freq.containsKey(s.charAt(i))){ 
                    i++;
                    total--;
                }
                else break;
            }
            if(count == chars && total<minw) {
                minw = total;
                ans.setLength(0);
                ans.append(s.substring(i, j+1));
                
            }
        }
        return ans.length() == 0 ? "-1" : ans.toString();
        
    }
}

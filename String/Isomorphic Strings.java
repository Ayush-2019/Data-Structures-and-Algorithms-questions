class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        int n = str1.length(), m = str2.length();
        
        if(n!=m) return false;
        
        for(int i=0;i<n;i++){
            
            if(!map1.containsKey(str1.charAt(i)) && !map2.containsKey(str2.charAt(i))){
                map1.put(str1.charAt(i), str2.charAt(i));
                map2.put(str2.charAt(i), str1.charAt(i));
            }
            
            else{
                if((map1.containsKey(str1.charAt(i)) && map1.get(str1.charAt(i)) != str2.charAt(i)) || (map2.containsKey(str2.charAt(i)) && map2.get(str2.charAt(i)) != str1.charAt(i))) return false;
            }
        }
        
        return true;
    }
}

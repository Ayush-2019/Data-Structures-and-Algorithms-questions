class Solution {
    
    public String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
 
        Arrays.sort(tempArray);
 
        return new String(tempArray);
    }
    
    public List<List<String>> Anagrams(String[] words) {
        // Code here
        TreeMap<String, List<String>> map = new TreeMap<>();
        
        for(String s : words){
            String sorted = sortString(s);
            
            if(!map.containsKey(sorted)){
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted, list);
            }
            else{
              //dont put here, doesn't work
                map.get(sorted).add(s);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        
        for(String str : map.keySet()){
            ans.add(map.get(str));
        }
        return ans;
    }
}

class TrieNode {
        
        HashMap<Character, TrieNode>map;

        boolean isEndOfWord;
        
        List<String> an;

        TrieNode() {
            map = new HashMap<>();
            
            an = new ArrayList<>();
            
            isEndOfWord = false;
        }
    };

class Solution {
    
    public String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
 
        Arrays.sort(tempArray);
 
        return new String(tempArray);
    }
    
    public void insert(TrieNode root, String sorted, String str){
        
        TrieNode ptr = root;
        
        for(int i=0;i<sorted.length();i++){
            
            char ch = sorted.charAt(i);
            
            if(!ptr.map.containsKey(ch)){
                ptr.map.put(ch, new TrieNode());
            }
            
            ptr = ptr.map.get(ch);
        }
        
        ptr.isEndOfWord = true;
        ptr.an.add(str);
    }
    
    public void search(TrieNode root, List<List<String>> ans){
        
        if(root.isEndOfWord == true){
            List<String>temp = new ArrayList<>();
            for(int i=0;i<root.an.size();i++){
                temp.add(root.an.get(i));
            }
            ans.add(temp);
        }
        
        for(char c='a';c<='z';c++){
            
            if(root.map.containsKey(c)){
                search(root.map.get(c), ans);
            }
        }
    }
    
    public List<List<String>> Anagrams(String[] list) {
        // Code here
        
        TrieNode root = new TrieNode();
        
        
        for(int i=0;i<list.length;i++){
            
            String sorted = sortString(list[i]);
            
            insert(root, sorted, list[i]);
        }
        
        List<List<String>> ans = new ArrayList<>();
        
        search(root, ans);
        
        return ans;
        
    }
}

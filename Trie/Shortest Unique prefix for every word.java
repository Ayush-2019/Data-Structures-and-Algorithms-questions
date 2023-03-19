class TrieNode {
        TrieNode[] children = new TrieNode[26];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;
        int occupied;

        TrieNode() {
            isEndOfWord = false;
            occupied = 0;
            for (int i = 0; i < 26; i++) children[i] = null;
        }
    };

class Solution {
    
    static TrieNode root;
    
    static void insert(TrieNode root, String key) 
    {
    // Your code here
    int index;
    
    TrieNode ptr = root;
    
    for(int i=0;i<key.length();i++){
        
        index = key.charAt(i) - 'a';
        
        if(ptr.children[index] == null){
            
            ptr.children[index] = new TrieNode();
        }
        ptr.children[index].occupied += 1;
        ptr = ptr.children[index];
    }
    
    ptr.isEndOfWord = true;
    }
    
    static String solve(TrieNode root, String str){
        
        String ans = "";
        
        TrieNode ptr = root;
        
        for(int i=0;i<str.length();i++){
            
            int index = str.charAt(i) - 'a';
            
            if(ptr.children[index].occupied>1 || ptr.occupied != 1 ){
                ans = ans + str.charAt(i);
            }
            else break;
            
            ptr = ptr.children[index];
        }
        
        return ans;
    }
    
    static String[] findPrefixes(String[] arr, int N) {
        // code here
        
        root = new TrieNode();
        
        for(int i=0;i<N;i++){
            insert(root, arr[i]);
        }
        
        String ans[] = new String[N];
        
        for(int i=0;i<N;i++){
            
            ans[i] = solve(root, arr[i]);
        }
        
        return ans;
    }
};

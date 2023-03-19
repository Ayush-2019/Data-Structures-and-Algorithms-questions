class TrieNode {
        TrieNode[] children = new TrieNode[26];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) children[i] = null;
        }
    };

class Solution
{
    
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
        ptr = ptr.children[index];
    }
    
    ptr.isEndOfWord = true;
}

    static boolean search(TrieNode root, String key)
{
    // Your code here
    
    int index;
    
    TrieNode ptr = root;
    
    for(int i=0;i<key.length();i++){
        
        index = key.charAt(i) - 'a';
        
        if(ptr.children[index] == null){
            
            return false;
            
        }
        
        ptr = ptr.children[index];
    }
    
    return ptr.isEndOfWord;
    
}
 

    static boolean solve(String A){
        
        int n = A.length();
        
        if(n == 0) return true;
        
        for(int i=1;i<=n;i++){
            
            if(search(root, A.substring(0,i)) && solve(A.substring(i))){
                return true;
            }
        }
        
        return false;
    }
    
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        
        root = new TrieNode();
        
        for(int i=0;i<B.size();i++){
            insert(root, B.get(i));
        }
        
        return solve(A) ? 1 : 0 ;
    }
}

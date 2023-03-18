/*
static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };
*/
//Function to insert string into TRIE.
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

//Function to use TRIE data structure and search the given string.
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

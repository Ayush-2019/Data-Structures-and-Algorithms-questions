class TrieNode {
        TrieNode[] children = new TrieNode[2];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;
        ArrayList<Integer>num;

        TrieNode() {
            isEndOfWord = false;
            num = new ArrayList<>();
            
            for (int i = 0; i < 2; i++) children[i] = null;
        }
    };

class GfG
{
    
    static void insert(TrieNode root, ArrayList<ArrayList<Integer>> ans, int[] key) 
    {
        // Your code here
        int index;
        
        TrieNode ptr = root;
        
        for(int i=0;i<key.length;i++){
            
            index = key[i];
            
            if(ptr.children[index] == null){
                
                ptr.children[index] = new TrieNode();
                
            }
            ptr = ptr.children[index];
        }
        
        ptr.isEndOfWord = true;
        
        if(ptr.num.size() == 0){
            for(int i=0;i<key.length;i++){
            
             ptr.num.add(key[i]);
           
        }
        
        ans.add(ptr.num);
        }
        
        
    }

    
    public static ArrayList<ArrayList<Integer>> uniqueRow(int arr[][],int r, int c)
    {
        //add code here.
        
        TrieNode root = new TrieNode();
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<r;i++){
            insert(root, ans, arr[i]);
        }
        
        
        return ans;
    }
}

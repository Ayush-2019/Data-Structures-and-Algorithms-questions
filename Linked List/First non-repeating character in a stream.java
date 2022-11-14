class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        // HashMap<Character, Integer> map = new HashMap<>();
        
        // ArrayList<Character> add_new = new ArrayList<>();
        
        // int n = A.length();
        // char first = '#';
        // String ans = "";
        
        // for(int i=0;i<n;i++){
            
        //     first = '#';
            
        //     char curr = A.charAt(i);
            
        //     if(!map.containsKey(curr)){
        //         map.put(curr, 1);
        //         add_new.add(curr);
        //     }
            
        //     else map.put(curr, map.get(curr)+1);
            
        //     for(int j=0;j<add_new.size();j++){
                
        //         if(map.get(add_new.get(j)) == 1){
        //             first = add_new.get(j);
        //             break;
        //         }
        //     }
            
        //     ans += first;
            
        // }
        
        // return ans;
        
      //More efficient approach
        HashMap<Character, Integer> map = new HashMap<>();
        
        Queue<Character> add_new = new LinkedList<>();
        
        int n = A.length();
        char first = '#';
        String ans = "";
        
        for(int i=0;i<n;i++){
            
            first = '#';
            
            char curr = A.charAt(i);
            
            if(!map.containsKey(curr)){
                map.put(curr, 1);
                add_new.add(curr);
            }
            
            else map.put(curr, map.get(curr)+1);
            
            while(!add_new.isEmpty()){
                
                if(map.get(add_new.peek()) == 1){
                    first = add_new.peek();
                    break;
                }
                
                else add_new.poll();
            }
            
            ans += first;
            
        }
        
        return ans;
    }
}

class Solution {
    public int findSubString( String s) {
        // Your code goes here
        
        HashMap<Character, Integer>map = new HashMap<>();
        int n = s.length(), chars = 0;
        
        for(int i=0;i<n;i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 0);
                chars++;
            }
    }
    
    int i=0, ans = Integer.MAX_VALUE, count = 0, total = 0;
    map.put(s.charAt(i), 1);
    count++;
    total++;
    if(count == chars) return 1;
    
    for(int j=1;j<n;j++){
        
        if(map.get(s.charAt(j)) == 0) count++;
        total++;
        
        
        map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
        
        while(i<j){
            if(map.get(s.charAt(i)) == 1) break;
            total--;
            map.put(s.charAt(i), map.get(s.charAt(i))-1);
            i++;
        }
        if(count == chars) ans = Math.min(ans, total);
    }
    return ans;
}

}

class Solution {
    public String reorganizeString(String str) {
        
        int alpha[] = new int[26];
		
		for(int i=0;i<str.length();i++){
		    alpha[str.charAt(i)-'a']++;
		}
		
		PriorityQueue<Pair>pq = new PriorityQueue<>(new comp());
		
		for(char x = 'a';x<='z';x++){
            
            if(alpha[x-'a']>0){
		    Pair p = new Pair(alpha[x-'a'], x);
		    pq.add(p);
            }
		}
		
		String ans = "";
		Pair prev = new Pair(-1,'*');
		while(!pq.isEmpty()){
		    Pair curr = pq.poll();
		    
		    ans += curr.c;
		    (curr.value)--;
		    
		    if(prev.value>0) pq.add(prev);
		    prev = curr;
		}
		
		if(ans.length() == str.length()) return ans;
		
		return "";
    }
}

class Pair{
    
    int value;
    char c;
    
    Pair(int value, char c){
        this.value = value;
        this.c = c;
    }
}

class comp implements Comparator<Pair>{
    public int compare(Pair p1, Pair p2){
        
        if(p1.value<p2.value) return 1;
        else if(p1.value>p2.value) return -1;
        else return 0;
    }
}

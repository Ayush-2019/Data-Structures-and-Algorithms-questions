class Solution
{
    
    static class Node implements Comparable<Node>

    {

        char c;

        int num;

        Node(char ch,int cnt)

        {

            c=ch;

            num=cnt;

        }

        

        public int compareTo(Node nd)

        {

            return nd.num-this.num;

        }

        

    }
    
	public static String rearrangeCharacters(String s) {
	
		//code here
		
		HashMap<Character, Integer> map = new HashMap<>();
		int n = s.length();
		
		for(int i = 0;i<n;i++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		for(char ch: map.keySet()){
		    pq.add(new Node(ch, map.get(ch)));
		}
		
		Node prev = new Node('@', -1);
		StringBuilder ans=new StringBuilder();
		
		while(pq.size()>0){
		    Node curr = pq.poll();
		    ans.append(curr.c);
		    curr.num -= 1;
		    if(prev.num > 0) pq.add(prev);
		    prev = curr;
		}
		
		return ans.length() == n ? ans.toString() : "-1";
	}
}


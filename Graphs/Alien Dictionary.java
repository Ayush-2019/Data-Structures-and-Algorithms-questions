class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<K;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            adj.add(temp);
        }
        
        for(int i=0;i<N-1;i++){
            int j=0;
            while(j<dict[i].length() && j<dict[i+1].length()){
                if(dict[i].charAt(j) != dict[i+1].charAt(j)){
                    
                    adj.get(dict[i].charAt(j)-'a').add(dict[i+1].charAt(j)-'a');
                    break;
                }
                j++;
            }
        }
        
        int[] in_degree = new int[K];
        
        String ans = "";
        
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                in_degree[adj.get(i).get(j)]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0;i<K;i++){
            if(in_degree[i]==0) q.add(i);
        }
        
        while(!q.isEmpty()){
            int curr = q.remove();
            ans+=(char)(curr + 'a');
            
            for(int i=0;i<adj.get(curr).size();i++){
                in_degree[adj.get(curr).get(i)]--;
                if(in_degree[adj.get(curr).get(i)]==0) q.add(adj.get(curr).get(i));
            }
            
        }
        
        return ans;
        
    }
}

class Solution {
    
    public int jobScheduling(int[] st, int[] et, int[] pr) {
        int n = st.length;
        
        class Job
        {
         int start, end, profit;
 
            Job(int start, int end, int profit)
            {
        this.start = start;
        this.end = end;
        this.profit = profit;
            }
        }
        Job jobs[] = new Job[n];
        for(int i=0;i<n;i++){
            jobs[i] = new Job(st[i],et[i],pr[i]);
        }
       
    class compare implements Comparator<Job>{
        public int compare(Job a, Job b)
        {
           return a.end < b.end ? -1 : a.end == b.end ? 0 : 1;
        }
    }
        Arrays.sort(jobs, new compare());
        
        int table[] = new int[n];
        table[0] = jobs[0].profit;
        
        for(int i=1;i<n;i++){
            int inc = jobs[i].profit;
            
            int l = -1;
            
            int low=0, high = i-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
           if(jobs[mid].end<=jobs[i].start){
                   l = mid;
                   low = mid+1;
               }
               
            else high = mid-1;
        }
        
            
            if(l!=-1) inc += table[l];
            
            table[i] = Math.max(table[i-1], inc);
        }
        return table[n-1];
    }
}

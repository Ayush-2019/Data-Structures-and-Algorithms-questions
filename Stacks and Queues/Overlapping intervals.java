class Solution
{
    
    public int[][] overlappedInterval(int[][] intervals)
    {
        // Code here 
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        
       int i=0, index = 1;
        
        while(index<intervals.length){
            
            if(intervals[i][1] >= intervals[index][0]){
                intervals[i][1] = Math.max(intervals[i][1], intervals[index][1]);
            }
            else{
                i++;
                intervals[i][0] = intervals[index][0];
                intervals[i][1] = intervals[index][1];
            }
            index++;
        }
        int ans[][] = Arrays.copyOfRange(intervals,0,i+1);
        return ans;
    }
}

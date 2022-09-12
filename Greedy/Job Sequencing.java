class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        
        int [] finish = new int[100];
        int[] res = {0,0};
        
        for(int i=0;i<n;i++){
            
            for(int j=arr[i].deadline-1;j>=0;j--){
                
                if(finish[j]==0){
                    
                    res[1]+=arr[i].profit;
                    res[0]++;
                    
                    finish[j]++;
                    break;
                }
            }
            
        }
        
        return res;
        
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/

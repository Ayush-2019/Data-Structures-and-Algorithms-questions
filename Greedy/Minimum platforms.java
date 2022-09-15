class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    
    //Space optimized approach O(1)
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plat = 1;
        
        int j = 0, i = 1;
        
        while(i<n){
            
            if(dep[j] >= arr[i]){
                plat++;
                i++;
            }
            else{
                j++;
                i++;
            }
        }
        return plat;
        
        // TC:- O(nlogn) SC:- O(n)
        ArrayList<int[]> trains = new ArrayList<>();
        for(int i=0;i<n ;i++){
            trains.add(new int[]{arr[i], dep[i]});
        }
        
        Collections.sort(trains, (a,b) -> a[0] - b[0]);
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(trains.get(0)[1]);
        
        for(int i=1 ;i<n ;i++){
            int arrival = trains.get(i)[0];
            int departure = trains.get(i)[1];
            if(arrival > pq.peek()){
                pq.poll();
            }
            pq.add(departure);
        }
        return pq.size();
    }
    
}


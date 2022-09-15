class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        int[][] meet = new int[n][2];
        
        for(int i=0;i<n;i++){
            meet[i][0]=start[i];
            meet[i][1]=end[i];
        }
        
        Arrays.sort(meet,(a,b)->a[1]-b[1]);
        
        int c=1,i=0,j=1;
        
        while(j<n){
            if(meet[i][1]<meet[j][0]){
                c++;
                i=j;
                j++;
            }
            else{
                j++;
            }
        }
        return c;
        
    }
}

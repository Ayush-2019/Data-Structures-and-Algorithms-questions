class Solution
{
    
    public static int countlessthan( int[][] arr, int target , int lastrow , int lastcol){
        
        int totalcount = 0;
        
        for( int row=0 ; row<=lastrow ; row++){
            
            if( arr[row][0]>target){
                break;
            }
            
            int[] onerow = arr[row];
            int count=0;
            int startindex=0; int endindex=onerow.length-1;
            
            while( startindex <= endindex){
                
                int midindex = (endindex+startindex) / 2;
                
                if( onerow[midindex]<target){
                    count = midindex+1;
                    startindex = midindex+1;
                }else{
                    endindex = midindex-1;
                }
            }
            
            totalcount += count;
            
        }
        
        return totalcount;
    }
    
	public static int kthSmallest(int[][]arr,int n,int k)
	{
        //code here.
        int lastrow = n-1; int lastcol=n-1;
        
        int low = arr[0][0]; 
        int high = arr[lastrow][lastcol];
        
        int ans=0;
        while( low<=high){
            
            int mid = (low+high)/2 ;
            
            int count = countlessthan( arr , mid , lastrow , lastcol);
            
            if( count<k){
                
                low=mid+1;
                ans = mid;
                
            }else{
                high = mid-1;
            }
        }
        
        return ans;
    }
    
    
    
}

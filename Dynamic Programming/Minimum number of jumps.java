class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        
        int jumps = 0, pos = 0;
        
        int max_choice_index = 0, max_choice = 0;
        
        while(pos<n-1){
             max_choice_index = 0;
             max_choice = 0;
            for(int i=pos+1;i<=pos+arr[pos];i++){
                if(i ==n-1) return jumps+1;
                if(max_choice <= i+arr[i]){
                    max_choice = i+arr[i];
                    max_choice_index = i;
                }
            }
            
            pos = max_choice_index;
            jumps++;
            if(max_choice == 0) return -1;
            
        }
        return jumps;
    }
}

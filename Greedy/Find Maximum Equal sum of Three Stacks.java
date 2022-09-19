class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int sum1 = 0, sum2 = 0, sum3 = 0;
        
        for(int i=0;i<N1;i++) sum1+= S1[i];
        for(int j=0;j<N2;j++) sum2+= S2[j];
        for(int i=0;i<N3;i++) sum3+= S3[i];
        
        int i = 0, j = 0,k = 0;
        
        while(i<N1 && j<N2 && k<N3){
            
            if(sum1 == sum2 && sum2 == sum3) return sum1;
            
            if(sum1>=Math.max(sum2, sum3)){
                sum1 -= S1[i];
                i++;
            }
            
            else if(sum2>=Math.max(sum1, sum3)){
                sum2 -= S2[j];
                j++;
            }
            
            else if(sum3>=Math.max(sum1, sum2)){
                sum3 -= S3[k];
                k++;
            }
            
            else{
                sum1 -= S1[i];
                i++;
                
                sum2 -= S2[j];
                j++;
                
                sum3 -= S3[k];
                k++;
                
                
            }
        }
        
        return 0;
    }
}
        

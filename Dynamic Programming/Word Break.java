class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        int n = A.length();
        
        boolean dp[] = new boolean[n+1];
        
        dp[0] = true;
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                if(B.indexOf(A.substring(j,i)) != -1){
                    dp[i] = true;
                    break;
                }
                
            }
        }
        
        if(dp[n] == true) return 1;
        return 0;
    }
}

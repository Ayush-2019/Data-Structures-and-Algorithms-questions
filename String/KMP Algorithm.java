class Solution{
    
    static void computeLPSArray(String pat, int M, int lps[])
    {
        int len = 0;
        int i = 1;
        lps[0] = 0;
 
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else 
            {

                if (len != 0) {
                    len = lps[len - 1];
 
                }
                else 
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    
    static int findLastOccurence(String txt,String pat){
        // code here
        
        int M = pat.length();
        int N = txt.length();
        int ans = -1;
 
        int lps[] = new int[M];
        int j = 0;

        computeLPSArray(pat, M, lps);
 
        int i = 0;
        while ((N - i) >= (M - j)) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                ans = i-j;
                j = lps[j - 1];
            }
 
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        
        return ans == -1 ? -1 : ans+1;
        
    }
}

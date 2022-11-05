class Solution {
    int lps(String pat) {
        // code here
        
        int len = 0;
        int i = 1, M = pat.length();
        
        int lps[] = new int[M];
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
        return lps[M-1];
    }
}

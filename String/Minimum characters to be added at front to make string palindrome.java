class Solution {
    
    public static int[] createLPS(String pat){
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
        return lps;
    }
    
    public static int minChar(String str) {
       //Write your code here
       
       int n = str.length();
       StringBuilder concat=new StringBuilder();
       concat.append(str+"@");
       
       for(int i=n-1;i>=0;i--) concat.append(str.charAt(i));
       
       int lps[] = createLPS(concat.toString());
       
       return n - lps[concat.length()-1];
    }
}

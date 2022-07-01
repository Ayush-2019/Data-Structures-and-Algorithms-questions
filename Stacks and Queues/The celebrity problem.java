class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int m[][], int n)
    {
    	// code here 
    	int c=0;
    	for(int i=1;i<n;i++) if(m[c][i] == 1) c = i;
    	
    	for(int i=0;i<n;i++) if(i!=c && (m[c][i] == 1 || m[i][c] == 0)) return -1;
    	
    	return c;
    }
}

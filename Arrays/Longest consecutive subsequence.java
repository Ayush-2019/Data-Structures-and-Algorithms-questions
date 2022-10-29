//User function Template for Java

class Solution
{   
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   
	   HashSet<Integer> map = new HashSet<Integer>();
	   
	   int ans = 1, chain = 0;
	   
	   for(int i=0;i<n;i++){
	       
	   map.add(arr[i]);
	   }
	   
	   for(int i=0;i<n;i++){
	       
	       int num = arr[i];
	       if(!map.contains(num-1)){
	               chain = 1;
	               int next = arr[i]+1;
	               while(map.contains(next)){
	                       chain++;
	                       ans = Math.max(chain, ans);
	                       next++;
	                   }
	               }
	           }
	           return ans;
	       }
	   }

class Solution {

  
  //Approach 1
	static int maxSumWO3Consec(int arr[], int n)
	{
		int sum[] = new int[n];
		if (n >= 1)
			sum[0] = arr[0];
    
		if (n >= 2)
			sum[1] = arr[0] + arr[1];

		if (n > 2)
			sum[2] = Math.max(sum[1], Math.max(arr[1] + arr[2], arr[0] + arr[2]));

		for (int i = 3; i < n; i++)
			sum[i] = Math.max(Math.max(sum[i - 1], sum[i - 2] + arr[i]),
							arr[i] + arr[i - 1] + sum[i - 3]);

		return sum[n - 1];
	}

  //Approach 2
  
static int maxSumWO3Consec(int n)
{
	if(sum[n] != -1)
		return sum[n];
	
	//Base cases (process first three elements)
	
	if(n == 0)
		return sum[n] = 0;
	
	if(n == 1)
		return sum[n] = arr[0];
	
	if(n == 2)
		return sum[n] = arr[1] + arr[0];
	
	return sum[n] = Math.max(Math.max(maxSumWO3Consec(n - 1),
					maxSumWO3Consec(n - 2) + arr[n]),
					arr[n] + arr[n - 1] + maxSumWO3Consec(n - 3));
	
	
}

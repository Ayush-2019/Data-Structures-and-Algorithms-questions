#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int n;
	cin>>n;
	
	while(true){
		
		long long int arr[n];
		int check = 0;
		for(int i=0;i<n;i++){
			
		  cin>>arr[i];
		  if(arr[i] == 0) check++;
		}
		
		long long int ans = 0;
		int b = 0, s = 0;
		
		while(check<n){
			
			while(arr[b] <=0) b++;
			
			while(arr[s] >=0) s++;
			
			long long int check_min = min(arr[b], abs(arr[s]));
			
			long long int dist = abs(s-b);
			
			arr[b] = arr[b] - check_min;
			arr[s] = arr[s] + check_min;
			
			ans += check_min*dist;
			if(arr[b] == 0) check++;
			if(arr[s] == 0) check++;
		}
		
		cout<<ans<<endl;
		
		cin>>n;
		if(n==0) break;
		
	}
	
	return 0;
}

#include <iostream>
#include<climits>
using namespace std;

int main() {
	// your code goes here
	int n,m; 
	cin>>n>>m;
		int max = INT_MIN;
		
		int arr[n];
		
		for(int i=0;i<n;i++) {
			cin>>arr[i];
			if(arr[i]>max) max = arr[i];
		}
		
		
		
		int low = 0, high = max, ans = 0;
		
		while(low<=high){
			long mid = (low+high)/2;
			
			long curr = 0;
			for(long i=0;i<n;i++){
				if(arr[i]>mid){
					curr += arr[i]-mid;
				}
			}
			
			if(curr>=m){
				ans = mid;
				low = mid+1;
			}
			else high = mid-1;
		}
		cout<<ans;
		
	return 0;
}

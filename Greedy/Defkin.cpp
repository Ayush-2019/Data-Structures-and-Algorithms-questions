#include <iostream>
#include <vector>
#include<algorithm>
using namespace std;

int main() {
		
		int t;
		cin>>t;
		
		while(t>0){
			
			int w, h, n;
			cin>>w>>h>>n;
			
			vector<int> a;
			vector<int> b;
			
			a.push_back(0);
			b.push_back(0);
			
			for(int i=0;i<n;i++){
				int x,y;
				cin>>x>>y;
				a.push_back(x);
				b.push_back(y);
			}
			
			a.push_back(w+1);
			b.push_back(h+1);
			
			sort(a.begin(), a.end());
			sort(b.begin(), b.end());
			
			int mx = 0, my = 0;
			
			for(int i=1;i<a.size();i++){
				mx = max(mx, a[i] - a[i-1]-1);
				my = max(my, b[i] - b[i-1]-1);
			}
			
			cout<<mx*my<<endl;
			t--;
			
		}
		
		
	
	
	
	return 0;
}

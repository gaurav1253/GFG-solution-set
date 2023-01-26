#include <bits/stdc++.h>
using namespace std;

int main() {
	int t; cin>>t; while(t--){
	    int n; cin>>n;
	    int a[n]; for(int i=0; i<n; i++) cin>>a[i];
	    for(int i=0; i<n; i+=2){
	        if(i+1<n && a[i+1] < a[i]) swap(a[i+1] , a[i]);
	        if(i+2<n && a[i+1] < a[i+2]) swap(a[i+1], a[i+2]);
	    }
	    for(int i=0; i<n; i++) cout<<a[i]<<" ";
	    cout<<'\n';
	    
	}
	return 0;
}

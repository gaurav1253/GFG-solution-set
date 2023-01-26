#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main() {
	int t; cin>>t; while(t--){
	    ll n; cin>>n;
	    ll a, flag=0;
	    set<ll> m;
	    for(int i=0; i<n; i++) { cin>>a; m.insert(a); }
	    set<ll> ::iterator it=m.begin();
	    for(int i=1; i<m.size(); i++){
	        int x = *it;
	        it++;
	        int y=*it;
	        if(y-x != 1){
	            flag=1;
	         cout<<"No\n";
	         break;
	        }
	    }
	    if(!flag) cout<<"Yes\n";
	}
	return 0;
}

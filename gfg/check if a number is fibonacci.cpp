#include <bits/stdc++.h>
using namespace std;


bool isPerfectSquare(int n){
    if(floor(sqrt(n)) * ceil(sqrt(n)) == n) return true;
    else return false;
}

bool isFib(int n){
    if(isPerfectSquare((5*n*n) + 4) ||
    isPerfectSquare((5*n*n) - 4)) return true;
    else return false;
}



int main() {
	int t; cin>>t; while(t--){
	    int n; cin>>n;
	    if(isFib(n) == true) cout<<"Yes\n";
	    else cout<<"No\n";
	}
	return 0;
}

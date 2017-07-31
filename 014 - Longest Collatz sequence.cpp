#include <bits/stdc++.h>
#define ll long long
using namespace std;

ll collatz(ll n){
    if(n == 1) return 1;
    if(n & 1)
        return 1 + collatz(n*3 + 1);
    return 1 + collatz(n/2);
}

int main(){
    ll mx = -1;
    for(int i=1; i<=1000000; i++){
        mx = max(mx, collatz(i));
    }
    cout<<mx<<endl;
    return 0;
}

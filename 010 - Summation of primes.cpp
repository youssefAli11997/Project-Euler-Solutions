#include <iostream>

using namespace std;

bool isPrime(int n){
    if(n==1)
        return false;
    for(int i=2; i*i<=n; i++){
        if(n%i==0)
            return false;
    }
    return true;
}

int main()
{
    long long sum=0;
    for(int i=1; i<2e6; i++){
        if(isPrime(i))
            sum += i;
    }
    cout<<sum<<endl;
    return 0;
}

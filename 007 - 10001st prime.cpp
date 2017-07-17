#include <iostream>

using namespace std;

bool primality_test(long long n){
    if(n<=1)
        return false;
    if(n==2 || n==3)
        return true;
    if(n%2==0 || n%3==0)
        return false;
    for(long long i=5; i*i<=n; i+=6){
        if(n%i==0 || n%(i+2)==0)
            return false;
    }
    return true;
}

bool isPrime(long long n){
    for(long long i=2; i*i<=n; i++){
        if(n%i==0)
            return false;
    }
    return true;
}

int main()
{
    long long i,x=0;
    for(i=2; x<10001; i++){
        if(primality_test(i) /* or isPrime(i)*/){
            x++;
            //cout<<i<<" ";
        }
    }
    cout<<i-1<<endl;
    return 0;
}

#include <iostream>

using namespace std;

long long result(int n){
    long long sumOfSquares=0,sum=0;
    for(int i=1; i<=n; i++){
        sumOfSquares += i*i;
        sum += i;
    }
    return (sum*sum)-sumOfSquares;
}

int main()
{
    cout<<result(100)<<endl;
    return 0;
}

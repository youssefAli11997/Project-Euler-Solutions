#include <iostream>

using namespace std;

int main()
{
    long long num,i;
    cin>>num;
    for(i=2; num>1; i++){
        while(num%i==0){
            num/=i;
            cout<<i<<" ";
        }
    }
    cout<<"\nmax: "<<i-1<<endl;
    return 0;
}

#include <iostream>

using namespace std;

bool isDivisible(long long n){
    for(int i=1; i<=20; i++){
        if(n%i!=0)
            return false;
    }
    return true;
}

int main()
{
    long long n = 1;
//    for(long long i=2520; i<1000000000; i++){
//        if(isDivisible(i))
//            cout<<i<<" ";
//    }
    while(!isDivisible(n))
        n++;
    cout<<n<<endl;
    return 0;
}

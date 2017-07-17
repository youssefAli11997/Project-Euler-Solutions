#include <iostream>

using namespace std;

bool isPalindrome(int n){
    int num[6],x=0;
    while(n){
        num[x++] = n%10;
        n/=10;
    }
    for(int i=0; i<x/2; i++){
        if(num[i]!=num[x-i-1])
            return false;
    }
    return true;
}

int main()
{
    int maxi = -1;
    for(int i=100; i<1000; i++){
        for(int j=100; j<1000; j++){
            if(i*j>maxi && isPalindrome(i*j))
                maxi = i*j;
        }
    }
    cout<<maxi<<endl;
    return 0;
}

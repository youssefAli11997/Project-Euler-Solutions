#include <iostream>
#include <time.h>
#include <ctype.h>

using namespace std;

int calc(){
    int a,b,c;
    for(a=2; a<=1000; a++){
        for(b=2; b<=1000; b++){
            c = 1000-a-b;
            if(a*a+b*b==c*c){
                cout<<a<<" "<<b<<" "<<c<<endl;
                return a*b*c;
            }
        }
    }
}

int main()
{
    time_t sec1 = time(NULL);
    cout<<calc()<<endl;
    time_t sec2 = time(NULL);
    cout<<"has taken: "<<sec2-sec1<<" seconds\n";
    return 0;
}

#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int h,a;
        cin>>h>>a;
        int state=0;
        int ans=0;
        while(h>0 && a>0)
        {
            if(state==0 or state==1 or state==2)
            {
                h=h+3;
                a=a+2;
                state=3;
                ans++;
            }
            else if(state==3)
            {
                if(h-5>0 and a-10>0)
                {
                    h=h-5;
                    a=a-10;
                    state=1;
                    ans++;
                }
                else if(h-20>0)
                {
                    h=h-20;
                    a=a+5;
                    state=2;
                    ans++;
                }
                else
                    break;
            }
        }
        cout<<ans<<endl;
    }
    return 0;
}

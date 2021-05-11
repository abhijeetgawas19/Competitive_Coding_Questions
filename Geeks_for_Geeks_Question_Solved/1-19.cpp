#include <iostream>
using namespace std;

int main() 
{
    int t,i;
    cin>>t;
    int N,X,count=0;
    while(t)
    {
        cin>>N>>X;
        int arr[N];
        for(i=0;i<N;i++)
        {
            cin>>arr[i];
        }
        for(i=0;i<N;i++)
        {
            if(arr[i]>X)
            {
                count++;
            }
        }
        cout<<count<<endl;
        count=0;
        t--;
    }
	return 0;
}

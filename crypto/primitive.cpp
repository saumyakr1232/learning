#include <iostream>
#include <math.h>
using namespace std;
bool IsPrime(long int n)
{
    for (int i = 2; i < n; i++)
    {
        if (n % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
int main()
{
    long int n;
    cin >> n;
    int temp, freq[n - 1];
    int flag = 0;
    int pre_root;
    for (int i = 0; i < n - 1; i++)
    {
        freq[i] = 0;
    }
    if (IsPrime(n))
    {
        //one of r is primitive root
        for (int r = 1; r <= n - 1; r++)
        {
            for (int x = 0; x <= n - 2; x++)
            {
                //checking the value of temp
                temp = fmod((pow(r, x)), n);
                //cout<<temp<<"*"<<endl;
                freq[temp] += 1;
            }
            for (int t = 0; t < n - 1; t++)
            {
                //cout<<freq[t]<<"\t";
                //checkng the frequency of occurance of each number
                if (freq[t] == 1)
                {
                    flag = 1;
                }
                //flag = 1 if freq of each no is one(none is repeating)
                else
                {
                    flag = 0;
                }
                //setting freq to for next round
                freq[t] = 0;
            }
            //cout<<endl;
            //if temps are unique
            if (flag == 1)
            {
                cout<<"Primitive root  :"<<r<<endl;
                pre_root = r;
                break;
            }
        }
    }

    cout << pre_root;
    return 0;
}
#include<iostream>
using namespace std;
int main(){
    int a = 12;
    int* p = &a;
    cout<<"Size of int is "<<sizeof(int)<< " bytes"<<endl;
    cout<<"Add :"<<p<<", Value : "<<*p<<endl;
    char* p1;
    p1 = (char*)p;
    cout<<"Size of char is "<<sizeof(char)<<" bytes"<<endl;
    cout<<"Address :"<<p1;

    return 0;
}
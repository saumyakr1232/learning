#include<iostream>
#include<string>
using namespace std;
int main() {
    char pt_array[50], ct_array[50], key_array[10], new_key[10];
    string pt, key;
    cout << "Enter the message " << endl;
    cin >> pt;
    cout << "Enter the key " << endl;
    cin >> key;

    int l1 = pt.length(), l2 = key.length();
    for (int i = 0; i < l1; i++) {
        pt_array[i] = pt[i];
        new_key[i] = key[i % l2];
        ct_array[i] = (pt_array[i] + new_key[i]) % 26 + 'a';
        pt_array[i] = (ct_array[i] - new_key[i] + 14) % 26 + 'a';
    }
    cout << "new key :-    ";
    for (int j = 0; j < l1; j++) {
        cout << new_key[j];
    }
    cout << endl;
    cout << "Cipher text :   ";
    for (int y = 0; y < l1; y++) {
        cout << ct_array[y];
    }
    cout << endl;
    cout << "plain text :    ";
    for (int h = 0; h < l1; h++) {
        cout << pt_array[h];
    }
    return 0;
}
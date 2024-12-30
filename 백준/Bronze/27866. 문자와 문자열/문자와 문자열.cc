#include <iostream>
#include <string>
using namespace std;


int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    
    string word; cin >> word;
    int i; cin >> i;

    cout << word[i-1];

    return 0;
}
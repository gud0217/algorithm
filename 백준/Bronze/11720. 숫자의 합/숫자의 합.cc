#include <iostream>
using namespace std;

int main(){

    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int n; cin >> n;
    string str; cin >> str;
    int sum = 0;

    for(int i = 0; i < n; i++){
        sum += str[i] - '0';
    }

    cout << sum;

    return 0;
}
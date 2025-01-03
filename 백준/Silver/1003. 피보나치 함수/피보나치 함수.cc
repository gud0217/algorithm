#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int t; cin >> t;
    int fibo[50] = {0,1};

    for(int i = 2; i < 51; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
            }

    for(int i = 0; i < t; i++){
        int x; cin >> x;

        if(x == 0){
            cout << 1 << ' ' << 0 << '\n';
        }

        else if(x == 1){
            cout << 0 << ' ' << 1 << '\n';
        }

        else{
            cout << fibo[x-1] << ' ' << fibo[x] << '\n';
        }
    }

    return 0;
}
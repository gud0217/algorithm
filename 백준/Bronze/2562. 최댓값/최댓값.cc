#include <iostream>
using namespace std;

int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int max = 0;
    int k;

    for(int i = 1; i <= 9; i++){
        int x ; cin >> x;
        if(x > max){
            max = x;
            k = i;
        }
    }

    cout << max << '\n' << k;

    return 0;
}
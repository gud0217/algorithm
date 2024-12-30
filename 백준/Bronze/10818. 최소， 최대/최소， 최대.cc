#include <iostream>
using namespace std;

int main(){

    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int n; cin >> n;
    int min = 100000000;
    int max = -100000000;
    
    for(int i = 0; i < n; i++){
        int x; cin >> x;
        if(x > max){
            max = x;
        }
        if(x < min){
            min = x;
        }
    }

    cout << min << ' ' << max;

    return 0;
}
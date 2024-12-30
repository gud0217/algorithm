#include <iostream>
using namespace std;

int main(){
    
    int max = -1;
    int index;

    for(int i = 1; i <= 81; i++){
        int x; cin >> x;

        if(x > max){
            max = x;
            index = i;
        }
    }

    int a,b;
    if(index % 9 == 0){
        a = index / 9;
        b = 9;
    }
    else{
        a = index / 9 + 1;
        b = index % 9;
    }

    cout << max << '\n' << a << ' ' << b;

    return 0;
}
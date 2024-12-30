#include <iostream>
using namespace std;

void A(int a, int b){
    cout << (a+b)*(a-b);
}

int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    
    int a, b; cin >> a >> b;
    
    A(a,b);
}
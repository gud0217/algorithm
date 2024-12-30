#include <iostream>
using namespace std;


int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    
    int n,x; cin >> n >> x;

    int arr[10000];
    for(int i = 0; i < n; i++){
        int k; cin >> k;
        if(k < x){
            cout << k << " ";
        }
    }

    return 0;
}
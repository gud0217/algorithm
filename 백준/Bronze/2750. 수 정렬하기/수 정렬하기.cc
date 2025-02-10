#include <iostream>
using namespace std;

void bubblesort(int a[], int n){
    bool swaped = true;
    while(swaped){
        swaped = false;
        for(int i = 1; i<n; i++){
            if(a[i] < a[i-1]){
                swap(a[i], a[i-1]);
                swaped = true;
            }
        }
    }
}
int main(){
    
    int n; cin >> n;
    int arr[10000];
    
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    bubblesort(arr,n);

    for(int i = 0; i<n; i++){
        cout << arr[i] << '\n';
    }

    return 0;
}
#include <iostream>
using namespace std;


int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    
    int n,m; cin >> n >> m;

    int arr1[100][100];
    int arr2[100][100];

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> arr1[i][j];
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> arr2[i][j];
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cout << arr1[i][j] + arr2[i][j] << " ";
        }
        cout << '\n';
    }

    return 0;
}
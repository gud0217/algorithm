#include <iostream>
using namespace std;

int main(){
    char arr[50][50];
    int min = 100000000;
    int a,b; cin >> a >> b;

    for(int i = 0; i < a; i++){
        for(int j = 0; j < b; j++){
            cin >> arr[i][j];
        }
    }

    for(int i = 0; i < a - 7; i++){
        for(int j = 0; j < b - 7; j++){

            int case1 = 0;
            int case2 = 0;
          
            for(int k = 0; k < 8; k++){
                for(int l = 0; l < 8; l++){
                    if((k + l) % 2 == 0 && arr[i+k][j+l] != 'B'){
                        case1++;
                    }
                    if((k + l) % 2 != 0 && arr[i+k][j+l] == 'B'){
                        case1++;
                    }
                    if((k + l) % 2 == 0 && arr[i+k][j+l] != 'W'){
                        case2++;
                    }
                    if((k + l) % 2 != 0 && arr[i+k][j+l] == 'W'){
                        case2++;
                    }
                }
            }

            if(case1 < min){
                min = case1;
            }

            if(case2 < min){
                min = case2;
            }
        }
    }

    cout << min;

    return 0;
}
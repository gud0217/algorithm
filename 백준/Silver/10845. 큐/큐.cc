#include <iostream>
#include <queue>
#include <string>
using namespace std;

int main(){
    int n; cin >> n;
    queue<int> que;

    for(int i = 0; i<n; i++){
        string a; cin >> a;
        if(a == "push"){
            int x; cin >> x;
            que.push(x);
        }
        else if(a == "pop"){
            if(que.empty()){
                cout << "-1" << '\n';
            }
            else{
                cout << que.front() << '\n';
                que.pop();
            }
        }
        else if(a == "size"){
            cout << que.size() <<'\n';
        }
        else if(a == "empty"){
            if(que.empty()){
                cout << "1" << '\n';
            }
            else{
                cout << "0" << '\n';
            }
        }
        else if(a == "front"){
            if(que.empty()){
                cout << "-1" << '\n';
            }
            else {
                cout << que.front() << '\n';
            }
        }
        else if(a == "back"){
            if(que.empty()){
                cout << "-1" << '\n';
            }
            else {
                cout << que.back() << '\n';
            }
        }
    }

    return 0;
}
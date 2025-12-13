#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

vector<int> adj[1010];
int visited[1010];
queue<int> q;

int main() {
	int n, m; cin >> n >> m;
	int num = 0;
	for (int i = 0; i < m; i++) {
		int a, b; cin >> a >> b;
		adj[a].push_back(b);
		adj[b].push_back(a);
	}
	for (int i = 1; i <= n; i++) {
		if (visited[i] == 1) continue;
		visited[i] = 1;
		q.push(i);
		while (!q.empty()) {
			int curr = q.front(); q.pop();
			for (auto next : adj[curr]) {
				if (visited[next] == 1) continue;
				visited[next] = 1;
				q.push(next);
			}
		}
		num++;
	}
	cout << num;
}
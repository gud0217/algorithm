import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 노드 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        
        List<Integer>[] graph = new ArrayList[N + 1]; // 연결 리스트로 그래프 선언
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>(); // 노드마다 연결 리스트 생성
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()); // 정점 1
            int v = Integer.parseInt(st.nextToken()); // 정점 2
            graph[u].add(v); // 연결
            graph[v].add(u); // 연결 (무방향)
        }

        boolean[] visited = new boolean[N + 1]; // 방문 배열
        int components = 0; // 요소 개수

        // 모든 정점을 순회하며, 아직 방문하지 않은 정점이 나오면, 새로운 연결 요소를 발견한 것이므로 components 증가.
        // 해당 정점에서 BFS로 같은 연결 요소에 속한 정점들을 모두 방문 처리
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                components++;
                bfs(i, graph, visited);
            }
        }
        
        System.out.println(components);
    }
    
    // start 정점부터 BFS 수행, 같은 연결 요소에 속한 모든 정점을 방문 처리
    private static void bfs(int start, List<Integer>[] graph, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>(); // 큐
        visited[start] = true;
        q.offer(start);
        
        // 큐가 빌 때 까지 반복, 인접 정점 탐색
        while (!q.isEmpty()) {
            int cur = q.poll(); // 현재 정점
            for (int next : graph[cur]) {
                if(!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
    
}
        
        
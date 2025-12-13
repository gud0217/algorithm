// 요소 찾기
// 컴퓨터 개수 n, computers로 간선 연결 표시
import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        Queue<Integer> q = new ArrayDeque<>(); // 큐
        boolean[] visited = new boolean[n]; // 방문 기록
        int answer = 0; // 개수
        
        // 전체 정점 확인
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                q.offer(i); // 큐에 넣기
                visited[i] = true; // 방문 기록
                answer++; // 개수
            
                // 큐 빌때까지 반복
                while(!q.isEmpty()) {
                    int cur = q.poll(); // 꺼내기
                    // 해당 컴퓨터 뒷번호 확인하기
                    for (int j = 0; j < n; j++) {
                        // 연결 && 방문 안함 확인
                        if (computers[cur][j] == 1 && !visited[j]) {
                            q.offer(j); // 큐에 넣기
                            visited[j] = true; // 방문 기록
                        }
                    }
                }
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    // 상하좌우 이동 방향 벡터
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int n = maps.length; // 지도 행 개수
        int m = maps[0].length; // 지도 열 개수
        
        boolean[][] visited = new boolean[n][m]; // 방문 여부 저장할 배열
        Queue<int[]> queue = new LinkedList<>(); // BFS를 위한 큐 선언
        
        // 시작점 0,0에서 출발, 이동거리 1부터 시작
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true; // 시작점 방문
        
        // BFS시작
        while(!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 위치 꺼내기
            int x = current[0];
            int y = current[1];
            int cnt = current[2]; // 현재까지 이동 거리
            
            // 도착지점 (n-1, m-1) 도착한 경우, 최단 거리 반환
            if(x == n-1 && y == m-1) {
                return cnt;
            }
            
            // 상하좌우 탐색
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 1. 이동 가능한 범위 (nx와, ny가 n과 m범위 내)
                // 2. 벽(0)이 아님 maps[nx][ny] == 1
                // 3. 아직 방문 안했어야함 !visited[nx][ny]
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true; // 방문 처리
                    queue.add(new int[]{nx, ny, cnt + 1}); // 이동거리 +1하여 큐에 추가
                }
            }
        }
        // 모든 경로 탐색 실패 시, -1
        return -1;
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length; // 세로
        int m = maps[0].length; // 가로
        
        // 방문 체크, 거리 저장
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        
        // 상, 하, 좌, 우
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};  
        
        Queue<int[]> q = new ArrayDeque<>();
        
        // 시작점 (0, 0)
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            // 목표 지점 도착
            if (x == n - 1 && y == m - 1) {
                return dist[x][y];
            }
            
            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 체크
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                
                // 벽이거나 이미 방문했으면 스킵
                if (maps[nx][ny] == 0 || visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        // 도달 불가능
        return -1;
    }
}
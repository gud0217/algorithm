class Solution {
    public int[] solution(int n) {
        // 2차원 배열 선언
        // 새로 알게된 점 : java에서는 초기화 시, 디폴트값 0으로 채워짐.
        int[][] triangle = new int [n][n];
        
        int v = 1;
        int x = 0;
        int y = -1;
        
        // 다 채워질 때 까지 무한반복
        while(true) {
            
            // 아래로 이동
            while(true) {
                y += 1;
                triangle[y][x] = v++;
                // 맨 밑줄 도착 or 이미 채워진 경우 다음 단계로
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
            }
            
            // 오른쪽으로 이동 못한다면, 종료
            if(x + 1 == n || triangle[y][x + 1] != 0) break;
            
            // 오른쪽 이동
            while (true) {
                x += 1;
                triangle[y][x] = v++;
                if(x + 1 == n || triangle[y][x + 1] != 0) break;
            }
            
            // 대각선 이동 못한다면, 종료
            if(triangle[y - 1][x - 1] != 0) break;
            
            // 대각선 이동
            while (true) {
                x -= 1;
                y -= 1;
                triangle[y][x] = v++;
                if(triangle[y - 1][x - 1] != 0) break;
            }
            
            // 아래로 이동 못한다면, 종료
            if(triangle[y + 1][x] != 0) break;
        }
        
        int length = n * (n + 1) / 2;
        int[] result = new int[length];
        int k = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[k] = triangle[i][j];
                k++;
            }
        }
        
        
        
        int[] answer = result;
        return answer;
    }
}
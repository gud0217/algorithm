class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        float a1 = (float)(dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        float a2 = (float)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        
        float b1 = (float)(dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        float b2 = (float)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        
        float c1 = (float)(dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        float c2 = (float)(dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
        
        if (a1 != a2 && b1 != b2 && c1 != c2) {
            answer = 0;
        } else {
            answer = 1;
        }
        
        
        return answer;
    }
} 
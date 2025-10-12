// 1. 배열 중 큰 수가 가장 긴 변인 경우
// 2. 나머지 한 변이 가장 긴 변인 경우

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        for (int i = 1; i < max; i++) {
            if (max < i + min) {
                answer++;
            }
        }
        
        for (int i = max; i < max + min; i++) {
            answer++;
        }
        
        return answer;
    }
}
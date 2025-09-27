// nCk

class Solution {
    public int solution(int balls, int share) {
        
        long answer = 1;
        int num = (balls - share) > share ? share : balls - share;
        
        for (int i = 0; i < num; i++) {
            answer *= (balls - i);
            answer /= (1 + i);
        }
        
        return (int)answer;
    }
}
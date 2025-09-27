// 장군 5, 병정 3, 일개미 1
// 딱맞게 최소한의 개미

class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        hp %= 5;
        answer += hp / 3;
        hp %= 3;
        answer += hp;
        
        return answer;
    }
}
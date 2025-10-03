// 정수 order에, 3,6,9가 몇개 있는지?
// 일의 자리부터 검사?
// 3,6,9가 몇개인지 확인한다
import java.util.Set;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        Set<Integer> set = Set.of(3,6,9);
        
        while(order > 0) {
            if (set.contains(order % 10)) {
                answer++;
            }
            order /= 10;
        }
        
        return answer;
    }
}
                
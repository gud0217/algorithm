// 남은 작업량 계산
// 남은 작업 일 계산
// 뒷 작업이 자기보다 클 때 까지 조건 확인
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 남은 작업량 계산
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
        }
        
        // 남은 일 수 계산
        for (int i = 0; i < progresses.length; i++) {
            int remain = progresses[i] / speeds[i];
            // 나누어 떨어지지 않는다면 +1일
            if (progresses[i] % speeds[i] > 0) {
                remain++;
            }
            progresses[i] = remain;
        }
        
        List<Integer> list = new ArrayList<>();
        
        int base = progresses[0];
        int count = 1;
        
        for (int i = 1; i < progresses.length; i++) {
            // 같이 배포 가능
            if (base >= progresses[i]) {
                count++;
            }
            
            // 새 배포
            else {
                list.add(count);
                base = progresses[i];
                count = 1;
            }
        }
        
        // 마지막 묶음 추가
        list.add(count);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
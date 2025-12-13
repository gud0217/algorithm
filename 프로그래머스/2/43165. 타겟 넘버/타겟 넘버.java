import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        
        // 현재까지 만들어진 합들을 저장할 큐
        Queue<Integer> queue = new ArrayDeque<>();
        
        // 시작 상태
        queue.offer(0);
        
        // numbers 배열의 숫자를 하나씩 사용
        for (int num : numbers) {
            
            // 현재 큐에 들어있는 원소 개수, 이 개수만큼만 꺼내서 적용해야 함
            int size = queue.size();
            
            // 같은 레벨
            for (int i = 0; i < size; i++) {
                int cur = queue.poll(); // 이전 단계에서 만든 합
                queue.offer(cur + num); // 현재 숫자 더하는 경우
                queue.offer(cur - num); // 현재 숫자 빼는 경우
            }
        }
        
        // 모든 숫자 다 사용 후, target과 같은 합의 개수를 센다
        int answer = 0;
        while (!queue.isEmpty()) {
            if (queue.poll() == target) {
                answer ++;
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    // dfs
    public void dfs(int idx, int sum, int[] numbers, int target) {
        // 1. 종료 조건
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
    // 2. 현재 숫자를 더하는 경우
    dfs(idx + 1, sum + numbers[idx], numbers, target);
    // 3. 현재 숫자를 빼는 경우
    dfs(idx + 1, sum - numbers[idx], numbers, target);
    }
}
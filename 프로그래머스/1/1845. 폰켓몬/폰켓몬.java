// 1. nums 길이 구하기
// 2. nums 배열 중복 제거한 길이 구하기
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 폰켓몬 수
        int numbers = nums.length;
        int max = numbers / 2;
        
        // 중복 제거
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i : nums) {
            hs.add(i);
        }
        
        // 총 종류가, max보다 크다면 max이고, 적다면 종류수만큼이다.
        if (hs.size() > max) {
            answer = max;
        } else {
            answer = hs.size();
        }
        
        return answer;
    }
}
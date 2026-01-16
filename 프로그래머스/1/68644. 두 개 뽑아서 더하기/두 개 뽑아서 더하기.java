import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[hs.size()];
        
        int idx = 0;
        for (int h : hs) {
            answer[idx] = h;
            idx++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
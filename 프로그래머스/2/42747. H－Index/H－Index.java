import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // 정렬 (인용 수 낮은 순서)
        Arrays.sort(citations);
        
        // h의 최댓값
        int answer = 0;
        
        // 반복
        for (int i = 1; i <= citations.length; i++) {
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] < i) continue;
                if (citations.length - j >= i) {
                    answer = i;
                }
            }
        }
        return answer;
    }
}
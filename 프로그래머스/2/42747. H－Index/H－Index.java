import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // 정렬 (인용 수 낮은 순서)
        Arrays.sort(citations);
        int n = citations.length;
        
        // 반복
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) return h;
        }
        return 0;
    }
}
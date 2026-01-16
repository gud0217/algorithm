import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 배열 정렬
        Arrays.sort(strings, (a, b) -> {
            // // n번째 글자 기준 오름차순 정렬.
            // 만약 같다면, 사전순으로 정렬.
            if (a.charAt(n) == b.charAt(n)) return a.compareTo(b);
            
            return a.charAt(n) - b.charAt(n);
        });
        
        return strings;
    }
}
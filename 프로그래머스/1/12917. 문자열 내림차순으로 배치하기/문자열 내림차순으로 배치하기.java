import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자열 -> 문자 배열
        char[] charArr = s.toCharArray();
        
        // 정렬
        Arrays.sort(charArr);
        
        StringBuilder sb = new StringBuilder();
        
        // 문자 배열 -> 문자열
        for (char c : charArr) {
            sb.append(c);
        }
        
        String answer = sb.reverse().toString();
        
        return answer;
    }
}
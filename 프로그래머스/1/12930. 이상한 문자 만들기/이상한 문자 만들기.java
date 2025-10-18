import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        char[] charArr = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            if (charArr[i] == ' ') {
                idx = 0;
                sb.append(' ');
                continue;
            }
            
            // 짝수번째 알파벳
            if (idx % 2 == 0) {
                sb.append(Character.toUpperCase(charArr[i]));
                idx++;
                continue;
            }
            // 홀수번째 알파벳
            else {
                sb.append(Character.toLowerCase(charArr[i]));
                idx++;
                continue;
            }
        }
        
        answer = sb.toString();
        return answer;
    }
}
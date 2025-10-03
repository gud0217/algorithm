// 문자열 s에서, 한번만 등장하는 문자들을 사전순으로 정렬하여 문자열로 return

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 앞에서부터 한 문자씩 확인한다.
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                // 해당 문자에 대해, 다시 나오는지 확인한다.
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                };
            }
            // 다시 나오지 않았다면, answer에 추가
            if (count == 1) {
                answer += s.charAt(i);
            }
        }
        
        // 문자열 -> 문자 배열
        char[] charArr = answer.toCharArray();
        // 문자 배열 사전순 정렬
        Arrays.sort(charArr);
        // 문자 배열 -> 문자열
        return String.valueOf(charArr);
    }
}